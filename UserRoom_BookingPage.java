package adminpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import org.openqa.selenium.support.ui.Select;

public class UserRoom_BookingPage extends BasePage {

    public UserRoom_BookingPage(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By rooms =
            By.xpath("//button[normalize-space()='Room Tools']");

    private By bookingRules =
            By.cssSelector("div[class='collapse show'] button:nth-child(4)");

    private By addNew =
            By.xpath("//button[normalize-space()='Add New']");

    private By userTags =
            By.xpath("//select[@formcontrolname='userTagId']");

    private By roomTags =
            By.xpath("//select[@formcontrolname='resourceTagId']");

    private By continueButton =
            By.xpath("//button[normalize-space()='Continue']");

    // Methods

    public void clickAdmin() {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    public void clickRooms() {
        wait.until(ExpectedConditions.elementToBeClickable(rooms)).click();
    }

    public void clickBookingRules() {
        wait.until(ExpectedConditions.elementToBeClickable(bookingRules)).click();
    }

    public void clickAddNew() {

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(addNew));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", button);
        js.executeScript("arguments[0].click();", button);
    }

   
    public void selectUserTag(String userTagName) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(userTags));

        Select select = new Select(dropdown);

        select.selectByVisibleText(userTagName);

        String selected = select.getFirstSelectedOption().getText();

        Assert.assertEquals(selected, userTagName);

        System.out.println("Selected User Tag: " + selected);
    }

    public void selectRoomTag(String roomTagName) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(roomTags));

        Select select = new Select(dropdown);

        select.selectByVisibleText(roomTagName);

        String selected = select.getFirstSelectedOption().getText();

        Assert.assertEquals(selected, roomTagName);

        System.out.println("Selected Room Tag: " + selected);
    }

    public void clickContinue() {

        WebElement continueBtn = wait.until(
                ExpectedConditions.elementToBeClickable(continueButton));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", continueBtn);

        System.out.println("Clicked Continue Button");
    }
}
