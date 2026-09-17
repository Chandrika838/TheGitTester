package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class ComputerBookingRules extends BasePage{
	
	public ComputerBookingRules(WebDriver driver) {
        super(driver);
    }

	
// locators 
	
private By Admin=
        By.xpath("//span[normalize-space()='Admin']");

private By Tools =
        By.xpath("//span[normalize-space()='Tools']");

private By ComputerTools= 
        By.xpath("//button[normalize-space()='Computer Tools']");
	

private By BookingRules =
        By.cssSelector("div[class='collapse show'] button:nth-child(4)");
	

private By automationTags =
By.cssSelector("span.tag-label[title='Automation Tags']");

// access 

private By Access =
        By.id("canAccessIsDefined");

// toogle 

private By Toogle = 
        By.id("canAccess");

// maxmium booking per month 

private By MaxmiumBookingpermonth=

        By.id("maximumNumberOfBookingsPerMonthIsDefined");

private By InputBox =
        By.id("maximumNumberOfBookingsPerMonth");
        		

// Booking duration 

private By BookingDuration = 
        By.id("maximumBookingDurationIsDefined");


private By Input1 = 
        By.id("maximumBookingDuration");


// booking per day 

private By Bookingperday =
        By.id("numberOfBookingsPerDayIsDefined");

private By Input2= 
        By.id("numberOfBookingsPerDay");

// booking allowed per day 

private By Bookingallowedperday = 
        By.id("maximumTimeAllowedPerDayIsDefined");

// input 3

private By Input3= 
        By.id("maximumTimeAllowedPerDay");

// Maxmium period to book in advance 

private By MaxmiumPeriodBookinAdvance =
        By.id("maxDaysInAdvanceIsDefined");

// input 4
private By Input4 =
        By.id("maxDaysInAdvance");

// extend 

private By Extend = 
        By.id("canExtendIsDefined");

// input 5 

private By Toogle1 =
        By.id("canExtend");

// auton extend 

private By AutoExtend = 
        By.id("autoExtendIsDefined");

private By Toogle2=
        By.id("id=autoExtend");

// Maxmiumextend time 

private By MaxmiumExtendtime =
        By.id("maximumExtendTimeIsDefined");

// input3 

private By Toogle3=
        By.id("maximumExtendTime");


// number of extension 

private By NumberofExtension =
        By.id("numberOfExtensionsIsDefined");
        
 
private By Toogle4 = 
        By.id("numberOfExtensions");



private By Submit =
        By.xpath("button[type='submit']");
// methods 


public void ClickAdmin() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Admin)).click();
		
}
	

public void ClickTools() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Tools)).click();
		
	}


public void ClickComputerTools() {
	 wait.until(ExpectedConditions.elementToBeClickable(ComputerTools)).click();
		
}


public void ClickBookingRules() {
	 wait.until(ExpectedConditions.elementToBeClickable(BookingRules)).click();
		
}


public void ClickTags() {

    WebElement tag = wait.until(
            ExpectedConditions.elementToBeClickable(automationTags)
    );

    tag.click();
}


// Access 

public void ClickAccess() {
	
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(Access));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }


// toogle

public void enableToogle() {
	
	    WebElement toggle = wait.until(
	            ExpectedConditions.elementToBeClickable(Toogle));

	    if (!toggle.isSelected()) {
	        toggle.click();
	    }
	}

//	MaxmiumBookingpermonth

public void clickMaxmiumBookingPerMonth() {
	
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(MaxmiumBookingpermonth));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }


public void enableInput(String value) {
	 WebElement textbox = wait.until(
           ExpectedConditions.visibilityOfElementLocated(InputBox));

   textbox.clear();          // Removes the existing value

   textbox.sendKeys(value); 

}


   
 public void ClickBookingDuration() {
	
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(BookingDuration));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
	 
 

 public void enableInput1(String value) {
	 WebElement textbox = wait.until(
           ExpectedConditions.visibilityOfElementLocated(Input1));

   textbox.clear();          // Removes the existing value

   textbox.sendKeys(value); 

 }
 

//booking per day 
 
 public void ClickBookingPerDay() {
		
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(Bookingperday));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 

 public void enableInput2(String value) {
	 WebElement textbox = wait.until(
           ExpectedConditions.visibilityOfElementLocated(Input2));

   textbox.clear();          // Removes the existing value

   textbox.sendKeys(value); 

 }
 
 
//booking allowed per day 
 
 public void ClickBookingAllowedPerDay() {
		
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(Bookingallowedperday));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 

 public void enableInput3(String value) {
	 WebElement textbox = wait.until(
           ExpectedConditions.visibilityOfElementLocated(Input3));

   textbox.clear();          // Removes the existing value

   textbox.sendKeys(value); 

 }
 

//Maxmium period to book in advance 
 
 public void ClickMaxmiumPeriodToBookinAdvance () {
		
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(MaxmiumPeriodBookinAdvance));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 
 public void enableInput4(String value) {
	 WebElement textbox = wait.until(
           ExpectedConditions.visibilityOfElementLocated(Input4));

   textbox.clear();          // Removes the existing value

   textbox.sendKeys(value); 

 }
 
 
 //extend
 
 public void ClickExtend () {
		
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(Extend));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 
 
 public void enableToogle1() {
		
	    WebElement toggle = wait.until(
	            ExpectedConditions.elementToBeClickable(Toogle1));

	    if (!toggle.isSelected()) {
	        toggle.click();
	    }
	}

 
// AutoExtend
 
 public void ClickAutoExtend() {
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(AutoExtend));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 
 public void enableToogle2() {
		
	    WebElement toggle = wait.until(
	            ExpectedConditions.elementToBeClickable(Toogle2));

	    if (!toggle.isSelected()) {
	        toggle.click();
	    }
	}

//MaxmiumExtendtime
 
 public void ClickMaxmiumExtendTime() {
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(MaxmiumExtendtime));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
 }
 
 public void ClickToogle3() {
	 
	 WebElement toggle = wait.until(
	            ExpectedConditions.elementToBeClickable(Toogle3));

	    if (!toggle.isSelected()) {
	        toggle.click();
	    }
	}
 
public void clickNumberofExtension() {
	 WebElement checkbox = wait.until(
             ExpectedConditions.elementToBeClickable(NumberofExtension));

	 if (!checkbox.isSelected()) {
         checkbox.click();
     }
}
 

public void ClickToogle4() {
	 WebElement toggle = wait.until(
	            ExpectedConditions.elementToBeClickable(Toogle4));

	    if (!toggle.isSelected()) {
	        toggle.click();
	    }
}


public void ClickSubmit() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Submit)).click();
}
}
