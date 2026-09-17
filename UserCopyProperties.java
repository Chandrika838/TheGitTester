package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class UserCopyProperties extends BasePage {

    public UserCopyProperties(WebDriver driver) {
        super(driver);
    }

    // Locators

    private final By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private final By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private final By users =
            By.xpath("//button[normalize-space()='User Tools']");

    private final By copyProperties =
            By.xpath("//button[normalize-space()='Copy Properties']");

    private final By sourceUser =
            By.id("searchBox");

    
    private By Tags = By.xpath("//input[@id='tag_6a1db48f-39e7-47cc-b2f0-019f93dcae59']");
    
    private By Tags1 =
            By.xpath("//input[@id='050de330-6ad2-4f24-b928-019ff9dfd879']");
    
    private By Tags2 =By.xpath("//input[@id='5b513fc8-13ab-4f4e-be84-01a023bde422']");
    
    private By Tags3=By.xpath("//input[@id='d89aa2e0-8768-4899-be77-019fdaa1a5a7']");
    
    private By UserRole =By.xpath("//input[@id='setting_USER_ROLE']");
    
    private By tags =By.xpath("//input[@id='setting_TAGS']");
    
    private By Replace = By.xpath("//input[@id='setting_TAGS_option_REPLACE']");
    
    private final By copyButton =
            By.xpath("//button[contains(@class,'btn-main')]");

    
    // Methods

    public void clickAdmin() {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    public void clickUsers() {
        wait.until(ExpectedConditions.elementToBeClickable(users)).click();
    }

    public void clickCopyProperties() {

        wait.until(ExpectedConditions.elementToBeClickable(copyProperties))
                .click();

        // Wait for Copy Properties page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(sourceUser));
    }

    public void enterSource(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(sourceUser));

        textbox.clear();
        textbox.sendKeys(value);
    }

    // Enable Tags
    public void enableTags() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Tags)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable Tags1
    public void enableTags1() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Tags1)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable Tags2
    public void enableTags2() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Tags2)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable Tags3
    public void enableTags3() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Tags3)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable User Role
    public void enableUserRole() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(UserRole)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable Tags Setting
    public void enableTagsSetting() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(tags)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    // Enable Replace
    public void enableReplace() {
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Replace)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void clickCopy() {
        wait.until(ExpectedConditions.elementToBeClickable(copyButton))
                .click();
    }
}