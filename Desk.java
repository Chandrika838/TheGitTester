package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;



public class Desk extends BasePage{
	
	public Desk(WebDriver driver) {
		super(driver);
		
// locators 
		
	}
	
	private By admin = 
			By.xpath("//span[normalize-space()='Admin']");
	
	private By Tools=
			
			By.xpath("//span[normalize-space()='Tools']");
	
	private By Users = 
			By.xpath("//button[normalize-space()='User Tools']");
	
	private By BookingRules =
			
	        By.cssSelector("div[class='collapse show'] button:nth-child(4)");
	
	
	private By Desk = 
			By.xpath("//button[normalize-space()='desks']");
	
	private By AllUsers =
			By.xpath("//div[@class='panel-opaque advancedContent collapse show']//span[@class='badge badge-tag badge-user-tag default-tag ms-0 me-0'][normalize-space()='All users']");

	private By Access = 
	        By.id("canAccess");
	
	private By MaxiumBookingPerMonth = 
			By.id("maximumNumberOfBookingsPerMonth");
	
	
	private By MaxiumByDuration =
			By.id("maximumBookingDuration");
	
	
	private By numberofbooking = 
			By.id("numberOfBookingsPerDay");
	
	private By Maximumallowedperday = 
			By.id("maximumTimeAllowedPerDay");
	
	private By MaximunPeriodadvance = 
			By.id("maximumTimeAllowedPerDay");
	
	

	
	private By Cancel =
			By.xpath("//button[normalize-space()='Cancel']");
	
	private By Update = 
			By.xpath("//span[normalize-space()='Update']");
	
	
	
	// methods
	
	public void ClickAdmin() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }
	
	
	public void ClickTools() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Tools)).click();
    }
	
	public void ClicUser() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Users)).click();
	}
	
	
	public void ClickBookingRules() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(BookingRules)).click();
		
	}
	
	
	
	public void ClickRooms() {
		 wait.until(ExpectedConditions.elementToBeClickable(Desk)).click();
		 
	}
	
	
	public void ClickAllusers() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(AllUsers)).click();
	}
			
	
	public void ClickAccess() {
		
		    WebElement checkbox = wait.until(
		            ExpectedConditions.elementToBeClickable(Access));

		    if (!checkbox.isSelected()) {
		        checkbox.click();
		    }
		}
	
	
	
	public boolean AccessisSelected() {
		
		return isSelected(Access);
		
	}
	
	
	public void enablemaxiumBookingPerMonth(String value ) {
		
		 WebElement textbox = wait.until(
	 	            ExpectedConditions.visibilityOfElementLocated(MaxiumBookingPerMonth));

	 	    textbox.clear();          // Removes the existing value

	 	    textbox.sendKeys(value); 
		 	
	}
	
	
	public boolean MaxiumBookingPerMonthDisplayed() {
		
		return isDisplayed(MaxiumBookingPerMonth);
	}
	
	
	public void enablemaxiumByDuration(String value ) {
		
		 WebElement textbox = wait.until(
 	            ExpectedConditions.visibilityOfElementLocated(MaxiumByDuration));

 	    textbox.clear();          // Removes the existing value

 	    textbox.sendKeys(value); 
 
	}


	public boolean MaxiumByDurationDisplayed() {
		
		return isDisplayed(MaxiumByDuration);
	}
	
	
	
public void enableNumberofbooking(String value ) {
	 WebElement textbox = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(numberofbooking));

	    textbox.clear();          // Removes the existing value

	    textbox.sendKeys(value); 
	
}


public void  enableMaximumallowedperday(String value ) {
	
	 WebElement textbox = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Maximumallowedperday));

	    textbox.clear();          // Removes the existing value

	    textbox.sendKeys(value); 
}



public void enableMaximunPeriodadvance(String value ) {
	
	 WebElement textbox = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(MaximunPeriodadvance));

	    textbox.clear();          // Removes the existing value

	    textbox.sendKeys(value); 
}


public boolean isDisplayedMaximumPeriodadvance() {
	
	return isDisplayed(MaximunPeriodadvance);
	
}

	

public void ClickCancel() {
	
	wait.until(ExpectedConditions.elementToBeClickable( Cancel)).click();
	
}


public void ClickSubmit() {
	wait.until(ExpectedConditions.elementToBeClickable( Update )).click();
	
}



}
	



