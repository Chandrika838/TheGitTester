package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class AdminRoomPage  extends BasePage {

public AdminRoomPage(WebDriver driver) {
	
	super(driver);
}

//locators 

private  By admin = 
         By.xpath("//span[contains(text(),'Admin')]");

private  By room = 
         By.xpath("//span[normalize-space()='Rooms']");	


private By addnew = 
        By.xpath("//span[normalize-space()='Add New']");


private By roomname = 
        By.xpath("//input[@formcontrolname='resourceName']");	


private By location = 
        By.id("locationId");	

private By duration = 
        By.id("defaultDuration");	


private By Capcity =
        By.xpath("//input[@formcontrolname='capacity']");

private By advanceoption = 
        By.xpath("//button[normalize-space()='advanced options']");


private By equipment1 = By.xpath("//input[@id='equipment__1']");

private By equipment2 = By.xpath("//input[@id='equipment__2']");

private By equipment3 = By.xpath("//input[@id='equipment__3']");

private By prepration = 
        By.id("preparationTime");


private By CheckNoShow =

        By.xpath("//input[@formcontrolname='checkInRequired']");

private  By tagsandBookings=
         By.xpath("//button[normalize-space()='tags & booking rules']");

private By TagsAdd=
        By.xpath("//button[contains(text(),'Add')]");


private By PleaseChoose= 
        By.cssSelector("select[name='selectedTag']");




private By submit = 
        By.xpath("//button[@type='submit']");



private By ErrorMessage=
        By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");


//Methods 

public void ClickAdmin() {

 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
}

//Asseration 

public boolean isAdminDispalyed() {

return isDisplayed(admin);
}

public void ClickRoom() {

wait.until(ExpectedConditions.elementToBeClickable(room)).click();

}

public boolean isRoomDisplayed() {

return isDisplayed(room);
}


public void ClickAddNew() {
	
	wait.until(ExpectedConditions.elementToBeClickable(addnew)).click();
}


public boolean isAddNewDisplayed() {

    return isDisplayed(addnew);
    
}



public void enterRoomName(String roomName) {

    wait.until(ExpectedConditions.visibilityOfElementLocated(roomname))
        .sendKeys(roomName);

   
}


public boolean isRoomNameDisplayed() {

return isDisplayed(roomname);

}



public void selectLocation(String value){

	Select select = new Select(getElement(location));
	select.selectByVisibleText(value);
	
	System.out.println("Location Value = " + value);
}

public boolean isLocationDisplayed() {

return isDisplayed(location);

}


public void enterDefaultDUration(String value) {

enterText(duration, value);

}


public void enterCapacityvalue(String value) {
	
	enterText(Capcity, value);
}


public void ClickAdvanceOption1() {
	
	wait.until(ExpectedConditions.elementToBeClickable(advanceoption)).click();
}



public void enablecheckRoomCamera() {
	WebElement checkroomcamera = driver.findElement(equipment1);
	if (!checkroomcamera.isSelected()) {
		checkroomcamera.click();
	}
}



public void enablecheckRoomProjector() {
	WebElement checkroomprojector = driver.findElement(equipment2);
	if (!checkroomprojector.isSelected()) {
		checkroomprojector.click();
	}
}



public void enablecheckRoomMonitor() {
	WebElement checkroommonitor = driver.findElement(equipment3);
	if (!checkroommonitor.isSelected()) {
		checkroommonitor.click();
	}
}


public void selectPrepartion(String value) {
	
Select select = new Select(getElement(prepration));

select.selectByVisibleText(value);


}



public boolean isPrepartionDisplayed() {
	
	return isDisplayed(prepration);
}



public void clickSubmit() {

wait.until(ExpectedConditions.elementToBeClickable(submit)).click();

}


public void selectCheckBox() {

WebElement element = wait.until(
ExpectedConditions.elementToBeClickable(CheckNoShow));
if (!element.isSelected()) {

element.click();


}
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



public boolean isSubmitDisplayed() {

return isDisplayed(submit);
}



public String getInvalidMessage() {

    WebElement message = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//p[contains(@class,'message-dialog') and normalize-space()='Invalid entry!']")
            )
    );

    return message.getText().trim();
}

}







