package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class RoomPage extends BasePage {

	public RoomPage(WebDriver driver) {
		
		super(driver);
		
	// locators
		
	}
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By rooms =
            By.xpath("//button[normalize-space()='Room Tools']");

    private By bookingRules =
            By.cssSelector("div[class='collapse show'] button:nth-child(4)");

    private By RoomPage = 
    		By.cssSelector("span[title='Automation Tags']");
    
    private By Access = 
    		By.id("canAccessIsDefined");
    
    private By Toogle = 
    		By.cssSelector("#canAccess");
    
    private By MaxiumPerMonth = 
    		By.id("maximumNumberOfBookingsPerMonthIsDefined");
    
    private By Toogle1 = 
    		By.id("maximumNumberOfBookingsPerMonth");
    
    private By MaxiumBookingDuration = 
    		By.cssSelector("#maximumBookingDurationIsDefined");
    
    private By Toogle2 = 
    		By.id("maximumBookingDuration");
    
    private By BookingPerDay =
    		By.id("numberOfBookingsPerDayIsDefined");
    
    private By Toogle3=
    		By.id("numberOfBookingsPerDay");
    
    
    private By MaximumAllowedPerDay =
    		By.cssSelector("#maximumTimeAllowedPerDayIsDefined");
    
    private By Toogle4 = 
    		By.id("maximumTimeAllowedPerDay");
    
    private By MaxiumperiodAdvance=
    		By.cssSelector("#maxDaysInAdvanceIsDefined");
    
    private By Toogle5 =
    		By.id("maxDaysInAdvance");
    
    private By Submit = 
 		   By.cssSelector("button[type='submit']");
    
    private By successMessage =
            By.cssSelector(".toast-message");
    
    
    // methods 
    
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

    		
    public void ClickRoomPage() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(RoomPage)).click();
}
    
   
    public void clickAccess() {

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Access));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }  
   
    }
    
    public void ClickToogle() {
    	
    	

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Toogle));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }  
   
    }
    
    
    public void ClickMaximumPerMonth() {
    	
    WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(MaxiumPerMonth));

    if (!checkbox.isSelected()) {
        checkbox.click();
    }  

}
    
    
    public void enableToogle1(String value ) {
    	
    	 WebElement textbox = wait.until(
    	            ExpectedConditions.visibilityOfElementLocated(Toogle1));

    	    textbox.clear();          // Removes the existing value

    	    textbox.sendKeys(value); 
    
    }
    
    public void ClickMaxiumBookingDuration() {
    	

    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaxiumBookingDuration));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
   }
    
    
    public void enableToogle2(String value ) {
    	 WebElement textbox = wait.until(
    	            ExpectedConditions.visibilityOfElementLocated(Toogle2));

    	    textbox.clear();          // Removes the existing value

    	    textbox.sendKeys(value); 
    }
    
    
    public void ClickBookingPerDay() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(BookingPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    
    public void enableToogle3(String value) {
    	 WebElement textbox = wait.until(
    	            ExpectedConditions.visibilityOfElementLocated(Toogle3));

    	    textbox.clear();          // Removes the existing value

    	    textbox.sendKeys(value); 
    }
    
    public void ClickMaximumAllowedPerDay() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaximumAllowedPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    
    
    public void enableToogle4(String value ) {
    	
    	WebElement textbox = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Toogle3));

	    textbox.clear();          // Removes the existing value

	    textbox.sendKeys(value); 
       
    }
        
    
    public void ClickMaxiumperiodAdvance() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaxiumperiodAdvance));

        if (!checkbox.isSelected()) {
            checkbox.click();
            
        }
    	
    }
    
    public void enableToogle5(String value) {
    	
    	WebElement textbox = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Toogle3));

	    textbox.clear();          // Removes the existing value

	    textbox.sendKeys(value); 
        
        
    }
    
    
    public void ClickSubmit() {
    	 wait.until(ExpectedConditions.elementToBeClickable( Submit)).click();
    
    }

    public String getSuccessMessage() {

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage));

        return message.getText();
    }
    
    }
        




