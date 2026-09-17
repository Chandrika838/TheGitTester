package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class DeskPage extends BasePage {

	public DeskPage (WebDriver driver) {
		super(driver);
		
		
	}


// locators 

private By admin = 
        By.xpath("//span[contains(text(),'Admin')]");

private By desk = 
        By.xpath("//span[normalize-space()='Desks']");

private By addnew = 
        By.xpath("//span[normalize-space()='Add New']");

private By deskname = 
        By.xpath("//input[@type='text']");

private By location = 
        By.id("locationId");

private By duration = 
        By.id("defaultDuration");

private By advanceoptions = 
        By.xpath("//button[normalize-space()='advanced options']");

private By prepartion = 
        By.id("preparationTime");

private By checkbox = 
        By.id("checkInRequired_");

private By tagsandBookings=
         By.xpath("//button[normalize-space()='tags & booking rules']");

private By TagsAdd=
        By.xpath("//button[contains(text(),'Add')]");


private By PleaseChoose= 
        By.cssSelector("select[name='selectedTag']");

// Add Button 

private By add = 
        By.xpath("//span[normalize-space()='Add']");


private By validationMessage =
       By.xpath("//p[contains(@class,'message-dialog') and normalize-space()='Invalid entry!']");



// Methods 


public void ClickAdmin() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
		
}

public void ClickDesk() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(desk)).click();
	 
	
}
	
public void ClickAddNew() {
	
	 wait.until(ExpectedConditions.elementToBeClickable(addnew)).click();
}
	

public boolean isDisplayedAddNew() {
	
	return isDisplayed(addnew);
}


public void enterDeskName(String deskName) {
	

    wait.until(ExpectedConditions.visibilityOfElementLocated(deskname))
        .sendKeys(deskName);
}

public void selectLocation(String value){

	Select select = new Select(getElement(location));
	select.selectByVisibleText(value);
	System.out.println("Location Value = " + value);
	
}


public boolean isDisplayedLocation() {
	
	return isDisplayed(location);
}


public void enterDefaultDuration(String value) {
	
	enterText(duration,value);
	
	
}
	

public void  ClickAdvanceOption2() {
	
	wait.until(ExpectedConditions.elementToBeClickable(advanceoptions)).click();
}
	

public void selectPrepartion(String deskpreptime) {
	
WebElement element = driver.findElement(prepartion);
	Select select = new Select(getElement(prepartion));
	
	select.selectByVisibleText(deskpreptime);
}


public boolean isDisplayedPrepartion() {
	
	return isDisplayed(prepartion);
}


public void enableCheckBox(String id) {
	
	By locator = By.id(id);
	
	if(!getElement(locator).isSelected()) {
		
		click(locator);
	}

	}



public void enableCheckInRequired() {

    enableCheckBox("checkInRequired_");

}

public boolean isSelectedCheckbox() {
	
	return isSelected(checkbox);
}


public void clickTagsandBooking() {
	
	wait.until(ExpectedConditions.elementToBeClickable(tagsandBookings)).click();
	
}

public void clickTagsAdd() {
	 
	wait.until(ExpectedConditions.elementToBeClickable(TagsAdd)).click();
	
}



public void selectTags(String value) {
 
	WebElement element = driver.findElement(PleaseChoose);
	Select select = new Select(getElement(PleaseChoose));
	
	select.selectByVisibleText(value);
	
	}



public void ClickAdd() {

    WebElement addButton = wait.until(
            ExpectedConditions.elementToBeClickable(add)
    );

    addButton.click();



}

public boolean isAddDisplayed() {
	
	return isDisplayed(add);
}



public String getInvalidMessage() {
	
	 WebElement message = wait.until(
	           ExpectedConditions.visibilityOfElementLocated(validationMessage)
	    );

	    return message.getText().trim();
	}



}



