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


public class Reserve_RoomPage extends BasePage{

	public Reserve_RoomPage(WebDriver driver) {
	
	super(driver);
	
	}	
	// locators 
	

private By reserve = 
        By.xpath("//span[normalize-space()='Reserve']");

private By room = 
        By.xpath("//span[normalize-space()='Room']");

private By location = 
        By.xpath("//app-location-selector//select");


private By datePicker = 
        By.cssSelector("span[role='button']");

private By nextButton = 
        By.xpath("//button[@title='Next month']");


private By MonthYear = 
        By.xpath("//div[@class='ngb-dp-month-name']");
	
private By tooltip = 
        By.cssSelector("div[role='button']");
        		

private By startTime = 
        By.xpath("//app-time-selector[@formcontrolname='startTime']//select");

private	 By dragDrop = 
         By.xpath("//div[@class='bs bs-marker']");
	
private By selfBooking = 
        By.id("selfBooking");	
	
private By Submit= 
        By.xpath("//span[normalize-space()='Book']");	


private By ErrorMessage= By.xpath("//p[normalize-space()='EntraId users does not exist']");
		
	
// methods 
	

public void clickReserve() {
	
	wait.until(ExpectedConditions.elementToBeClickable(reserve)).click();	
	
}

public void clickRoom() {
	
	wait.until(ExpectedConditions.elementToBeClickable(room)).click();
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



	
public void clickToolTip() {
	
    WebElement tooltipElement = wait.until(
            ExpectedConditions.refreshed(
                    ExpectedConditions.elementToBeClickable(tooltip)));

    tooltipElement.click();
    
    
}


public boolean isDisplayedTooltips() {
	
	return isDisplayed(tooltip);
	
}



public void selectStartime(String value) {
	

    // Wait until the dropdown is visible
    WebElement dropdown = wait.until(
            ExpectedConditions.visibilityOfElementLocated(startTime));

    // Wait until the dropdown is clickable
    wait.until(ExpectedConditions.elementToBeClickable(dropdown));

    // Create Select object
    Select select = new Select(dropdown);

    
    // Select the value
    select.selectByVisibleText(value);
}


public void clickDragdrop() {
	
	WebElement element = getElement(dragDrop);
	
	new Actions(driver).dragAndDropBy(element, 15, 0).perform();

}

public void enableSelfBooking() {
	
	WebElement checkbox = getElement(selfBooking);
	
	if(!checkbox.isSelected()) {
		
		checkbox.click();
	}
	
}


public boolean isSelectedSelfBooking() {
	
	return isSelected(selfBooking);
	
}


public void clickSubmit() {
	WebElement button = wait.until(
            ExpectedConditions.elementToBeClickable(Submit));
	button.click();

}

public boolean isDisplayedBooks() {
	
	return isDisplayed(Submit);
}


public String getValidationMessage() {

    WebElement message = wait.until(
        ExpectedConditions.visibilityOfElementLocated(ErrorMessage)
    );

    return message.getText().trim();
}

}
