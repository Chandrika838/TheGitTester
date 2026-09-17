package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class DeskCopyProperties extends BasePage{

	public DeskCopyProperties(WebDriver driver) {
		
		super(driver);
	
	}
	
	// locators 
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");
    
    private By Desk = 
    		By.xpath("//button[normalize-space()='Desk Tools']");
    
    private By CopyProperties = 
    		By.cssSelector("div[class='collapse show'] button:nth-child(2)");
    
    private By Source = 
    	    By.xpath("//select[@formcontrolname='sourceId']");
    
    
    private By location = 
    		By.xpath("//select[@id='selectedLocationId']");
    
    private By Tags = 
    		By.cssSelector("input.form-check-input");
    
    private By Setting = 
    		By.id("setting_LOCATION");
    
    private By Duration = 
    		By.id("setting_DEFAULT_DURATION");
    
    
    private By Prepartiontime =
    		By.id("setting_PREPARATION_TIME");
    
    
    private By Check = 
    		By.id("setting_CHECK_IN_SETTINGS");
    
    
    private By tags =
    		By.id("setting_TAGS");
    
    private By Copy = 
    		By.cssSelector("button[type='submit']");
    
  
   
   // Methods 
    
    public void ClickAdmin() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }
    
    public void ClickTools() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }
    
    
    public void ClickDesk() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(Desk)).click();
    }
    
    
   public void ClickCopyProperties() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(CopyProperties)).click();
   }
    
    
   public void SelectSource(String value) {
	   
	   WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Source));

	    Select select = new Select(dropdown);
	    select.selectByVisibleText(value);
   }
    
 
   public void SelectLocations(String value) {

	    WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(location));

	    Select select = new Select(dropdown);
	    select.selectByVisibleText(value);
	} 
   
   
   public void enableCheckbox() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Tags));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	}
   
  
 public void enableSetting() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Setting));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
 
 public void enableDefault() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Duration));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}


 public void enablePrepartionTime() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Prepartiontime));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
 
 
 public void enableCheckinSetting() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Check));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}
 

 public void enableCheckinTags1() {

	    WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(tags));

	    if (!checkbox.isSelected()) {
	        checkbox.click();
	    }
	
}

   public void ClickCopy() {
	   
	   wait.until(ExpectedConditions.elementToBeClickable(Copy)).click();
   }
   
   
   
   }
	   
	  

