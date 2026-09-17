package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class LocationsCopyProperties extends BasePage {

    public LocationsCopyProperties(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By locationTools =
            By.xpath("//button[normalize-space()='Location Tools']");

    private By copyProperties =
            By.cssSelector("div[class='collapse show'] button[type='button']");

    private By sourceLocation =
            By.cssSelector("select[name='sourceId']");
    
    private By target =
            By.id("1f1b01d4-9bdb-4cca-9aa5-01a0472e0183");
    
    private By parentlocation =
    		By.xpath("//input[@id='setting_PARENT_LOCATION']");
    
    private By timezone =
    		By.cssSelector("#setting_TIME_ZONE");
    
    private By WorkingHours = 
    		By.cssSelector("#setting_WORKING_HOURS");
    
    private By copyButton =
            By.xpath("//button[contains(@class,'btn-main')]");

    // Methods

    public void clickAdmin() {

        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {

        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }
    
    public void clickLocationTool() {
        wait.until(
                ExpectedConditions.elementToBeClickable(locationTools)
        ).click();
    }
   
   
    public void clickCopyProperties() {
    	 wait.until(
                 ExpectedConditions.elementToBeClickable(copyProperties)
         ).click();
     }
    	
    
    public void selectLocation(String locationName) {

        // Wait until dropdown is present in DOM
        WebElement dropdown = wait.until(
                ExpectedConditions.presenceOfElementLocated(sourceLocation)
        );

        // Scroll dropdown into view
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                dropdown
        );

        // Create Select object
        Select select = new Select(dropdown);

        // Select location by visible text
        select.selectByVisibleText(locationName);
    }


    
    public void enableTarget() {

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(target)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
  
   
   public void enableParentLocation() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(parentlocation));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
		 
       }
   
   
   public void enableTimeZone() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(timezone));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
		 
       }
   
public void enableWorkingHours() {
	   
	   WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(WorkingHours));

		 if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
   
}
   

    public void clickCopy() {

        wait.until(ExpectedConditions.elementToBeClickable(copyButton)).click();
    }
}