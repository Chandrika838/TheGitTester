package adminpage;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class Reserve_DeskPage extends BasePage{


	public Reserve_DeskPage(WebDriver driver) {
	
	super(driver);
	
	
	// locator 
	
	}
	
	
private By reserve = 
        By.xpath("//span[normalize-space()='Reserve']");
	
private By desk = 
        By.xpath("//span[normalize-space()='Desk']");	
	
private By location = 
        By.xpath("//select[@id='selectedLocationId']");


private By datePicker = 
        By.cssSelector("span[role='button']");

private By nextButton = 
        By.xpath("//button[@title='Next month']");


private By MonthYear = 
        By.xpath("//div[@class='ngb-dp-month-name']");

private By tooltip = 
        By.xpath("(//div[contains(@class,'bs-slot') and contains(@class,'bs-available')])[1]");
	
private By StartTime1 =
        By.xpath("//app-time-selector[@formcontrolname='startTime']//select");

private By dragDrop = 
        By.xpath("//div[@class='bs bs-marker']");
	
private By selfBooking = 
        By.id("selfBooking");

private By book = 
        By.xpath("//span[normalize-space()='Book']");


// methods 


public void ClickReserve() {
	
	wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();
	
}


public void ClickDesk() {
	
	wait.until(ExpectedConditions.elementToBeClickable(desk)).click();
}


public void SelectLocation(String value) {

    Select select = new Select(getElement(location));

    select.selectByVisibleText(value);
    
}

public boolean isDisplayedLocation() {
	
	return isDisplayed(location);
}

public void selectDate(LocalDate bookingDate) {

	// Open Calendar
	wait.until(ExpectedConditions.elementToBeClickable(datePicker)).click();

	// Convert LocalDate to Month Year format
	String expectedMonthYear =
			bookingDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH)
					+ " "
					+ bookingDate.getYear();

	String expectedDay = String.valueOf(bookingDate.getDayOfMonth());

	while (true) {

		String currentMonthYear = wait.until(
						ExpectedConditions.visibilityOfElementLocated(MonthYear))
				.getText().trim();

		System.out.println("Current Month : " + currentMonthYear);
		System.out.println("Expected Month : " + expectedMonthYear);

		if (currentMonthYear.equals(expectedMonthYear)) {
			break;
		}

		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}

	By day = By.xpath(
			"//div[contains(@class,'ngb-dp-day') and not(contains(@class,'disabled'))]//div[text()='"
					+ expectedDay + "']");

	wait.until(ExpectedConditions.elementToBeClickable(day)).click();
}





public void ClickToolTip() {
	

	    WebElement tooltipElement = wait.until(
	            ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(tooltip)));

	    tooltipElement.click();
	}


public boolean isDisplayedToolTip() {
	
	return isDisplayed(tooltip);
}


public void SelectStartTime1(String value) {
	 WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(StartTime1));

	    // Wait until the dropdown is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

	    // Create Select object
	    Select select = new Select(dropdown);

	    
	    // Select the value
	    select.selectByVisibleText(value);
}


public boolean isDisplayedStartTime1() {
	
	return isDisplayed(StartTime1);
}


public void ClickDragDrop() {
	
	  WebElement drag = wait.until(
   
		ExpectedConditions.elementToBeClickable(dragDrop));

	new Actions(driver).dragAndDropBy(drag,15, 0).perform(); 
	
}



public void enableSelfBooking() {
	
	WebElement checkbox = wait.until(
            ExpectedConditions.elementToBeClickable(selfBooking));
	
	if(!checkbox.isSelected()) {
		checkbox.click();
	}
}


public boolean isDisplayedSelfBooking() {
	
	return isDisplayed(selfBooking);
}


public void ClickBook() {
	
	click(book);
}


public boolean isDisplayedBook() {
	
	return isDisplayed(book);
}

}
