package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class LocationPage extends BasePage{

	public LocationPage(WebDriver driver) {
		
		super(driver);
		
	}
	

	// locators 
	
	
private By Admin = 
        By.xpath("//span[normalize-space()='Admin']");

private By Location=
        By.xpath("//span[normalize-space()='Locations']");


private By AddNew = 
        By.xpath("//span[normalize-space()='Add New']");


private By LocationName = 
        By.xpath("//input[@formcontrolname='locationName']");


private By AdvanceOptions = 

        By.xpath("//button[normalize-space()='advanced options']");

private By ParentLocation=
        By.xpath("//select[@name='selectedLocation']");

private By TimeZone =
        By.cssSelector("#_inheritTimeZone");


private By Inheritancefrorganisation=
        By.xpath("//app-time-zone-selector/select");

private By WorkingHours=
        By.xpath("//app-working-day-editor[1]//div[1]//div[2]//button[1]");

private By NonWorkingday=
By.xpath("//input[@id='false']");

private By startHour =
By.xpath("(//input[@placeholder='HH'])[1]");

private By startMinute =
By.xpath("(//input[@placeholder='MM'])[1]");

private By endHour =
By.xpath("(//input[@placeholder='HH'])[2]");

private By endMinute =
By.xpath("(//input[@placeholder='MM'])[2]");


private By custom=
        By.xpath("//div[@class='panel-transparent advancedContent collapse show']//a[@role='button'][normalize-space()='Add']");

private By Name=
        By.xpath("//input[@id='name']");


private By Todayto=
        By.xpath("//app-date-selector[@id='startDate']//button[1]");

private By TodayFrom=
        By.xpath("//app-date-selector[@id='endDate']//button[1]");

	

private By Add=
        By.cssSelector("button[type='submit']");
	

private By ErrorMessage =
        By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");
// methods 


public void ClickAdmin() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Admin)).click();
		
}
	
public boolean isAdminDisplayed() {
	
	return isDisplayed(Admin);
}

public void ClickLocation() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(Location)).click();
		
	}


public boolean isLocationDisplayed() {
	
	return isDisplayed(Location);
}

public void ClickAddNew() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(AddNew)).click();
		
}


public void enterLocationName(String locationName) {
    enterText(LocationName, locationName);

}


public boolean isenterLocationNameDisplayed() {
	
	return isDisplayed(LocationName);
}

public void ClickAdvanceOptions() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(AdvanceOptions)).click();
}

public void SelectParentLocation(String value) {
	
	 wait.until(ExpectedConditions.elementToBeClickable(ParentLocation)).click();
	 
	 Select select = new Select(getElement(ParentLocation));
		select.selectByVisibleText(value);
}


public  void enableTimeZone() {
	
	WebElement checkInheritance = driver.findElement(TimeZone);
	if (checkInheritance.isSelected()) {
		checkInheritance.click();
	}
}


public void SelectInheritancefrorganisation(String value) {

    WebElement dropdown = wait.until(
            ExpectedConditions.elementToBeClickable(Inheritancefrorganisation)
    );

    Select select = new Select(dropdown);
    select.selectByVisibleText(value.trim());
}


public  void enableNonWorkingday() {
	
	WebElement checkInheritance = driver.findElement(NonWorkingday);
	if (!checkInheritance.isSelected()) {
		checkInheritance.click();
	}
}



public void clickWorkingHours() {

    wait.until(
            ExpectedConditions.elementToBeClickable(WorkingHours)
    ).click();
}


public void setWorkingHours(
        String startHourValue,
        String startMinuteValue,
        String endHourValue,
        String endMinuteValue) {

    enterText(startHour, startHourValue);
    enterText(startMinute, startMinuteValue);
    enterText(endHour, endHourValue);
    enterText(endMinute, endMinuteValue);
}


public void clickCustomAdd() {

    wait.until(
        ExpectedConditions.elementToBeClickable(custom)
    ).click();
}


public void enterCustomName(String value) {

    enterText(Name, value);
}


public void clickDateFrom() {

    wait.until(
        ExpectedConditions.elementToBeClickable(Todayto)
    ).click();
}


public void clickDateTo() {

    wait.until(
        ExpectedConditions.elementToBeClickable(TodayFrom)
    ).click();
}

	
public  void ClickAdd() {
	 wait.until(ExpectedConditions.elementToBeClickable(Add)).click();
}


public boolean isAddDisplayed() {
	
	return isDisplayed(Add);
}

public boolean InvalidBlankDisplayed() {
	
	return isDisplayed(ErrorMessage);

}

}
