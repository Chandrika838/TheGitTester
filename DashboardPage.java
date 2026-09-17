package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class DashboardPage extends BasePage {

    private final By loggedInUserName = By.cssSelector(".navbar-name");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedInUserNameDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInUserName)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getLoggedInUserName() {
        @SuppressWarnings("null")
        WebElement userName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(loggedInUserName));
        return userName.getText().trim();
    }
}
