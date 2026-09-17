package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
public class DeskBookingRules extends BasePage {

	public DeskBookingRules(WebDriver driver) {
		
		super(driver);
		
	}
	
	
	// locators 
	
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");
    
    private By Desk = 
    		By.xpath("//button[normalize-space()='Desk Tools']");
    
    
    private By BookingRule = 
    		By.cssSelector("div[class='collapse show'] button:nth-child(4)");
    
    private By DeskPage=
    		By.cssSelector("span[title='Automation Tags']");
    
    
    private By Access = 
    		By.id("canAccessIsDefined");
  
    
    private By MaxiumPerMonth = 
    		By.id("maximumNumberOfBookingsPerMonthIsDefined");
    
   
    
    private By MaxiumBookingDuration = 
    		By.cssSelector("#maximumBookingDurationIsDefined");
    
   
    
    private By BookingPerDay =
    		By.id("numberOfBookingsPerDayIsDefined");
    
   
    
    
    private By MaximumAllowedPerDay =
    		By.cssSelector("#maximumTimeAllowedPerDayIsDefined");
    
   
    
    private By MaxiumperiodAdvance=
    		By.cssSelector("#maxDaysInAdvanceIsDefined");
    

    
    private By Submit = 
 		   By.cssSelector("button[type='submit']");
    
    
    
    
    // methods 
    
    public void clickAdmin() {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    public void ClickDesk() {
        wait.until(ExpectedConditions.elementToBeClickable(Desk)).click();
    }

    public void ClickBookingRules() {
        wait.until(ExpectedConditions.elementToBeClickable(BookingRule)).click();
    }

    		
    public void ClickDeskPage() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(DeskPage)).click();
}
    
   
    public void clickAccess() {

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(Access));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }  
   
    }
    
   
    public boolean isAccessSelected() {
    	
    	return isSelected(Access);
    }
    
    
    
    public void ClickMaximumPerMonth() {
    	
    WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(MaxiumPerMonth));

    if (!checkbox.isSelected()) {
        checkbox.click();
    }  

}
    
 
    
  public boolean isMaximumPerMonthSelected() {
	  
	  return isSelected(MaxiumPerMonth);
  }
  
  
    
    public void ClickMaxiumBookingDuration() {
    	

    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaxiumBookingDuration));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
   }
    
    public boolean isSelectedMaxiumBookingDuration() {
    	
    	return isSelected(MaxiumBookingDuration);
    }
    
   
    
    
    public void ClickBookingPerDay() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(BookingPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    
    
    public boolean isSelectedBookingPerDay() {
    	
    	return isSelected(BookingPerDay);
    }
    
    
   
    
    public void ClickMaximumAllowedPerDay() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaximumAllowedPerDay));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    
    
    public boolean isSelectedMaxiumAllowedPPerDay() {
    	
    	return isSelected(MaximumAllowedPerDay);
    }
    
    
    
    
    public void ClickMaxiumperiodAdvance() {
    	
    	WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(MaxiumperiodAdvance));

        if (!checkbox.isSelected()) {
            checkbox.click();
            
        }
    	
    }
    
    public boolean isSelectedMaxiumperiodAdvance() {
    	
    	return isSelected(MaxiumperiodAdvance);
    }
    
    
    
    
    
    public void ClickSubmit() {
    	 wait.until(ExpectedConditions.elementToBeClickable( Submit)).click();
    
    }

   
    public boolean isSubmitDisplayed() {
    	
    	 return wait.until(ExpectedConditions.visibilityOfElementLocated(Submit)).isDisplayed();
		 
    }
    }
    
    
        


