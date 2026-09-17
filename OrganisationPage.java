package adminpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;


public class OrganisationPage extends BasePage {

	public OrganisationPage(WebDriver driver) {
		super(driver);
		
	}


// locators 
	 // here we need to write alll the main main things in the adminpage of java 
	
private	By adminMenu = 
        By.xpath("//span[contains(text(),'Admin')]");

private By organisation =
         By.xpath("//span[normalize-space()='Organisation']");
private By language = 
        By.cssSelector("select[name='language']");

private By timeZone = 
        By.xpath("//app-time-zone-selector//select");

private By advancedOption = 
        By.xpath("//button[normalize-space()='advanced options']");


//private By Theme=
      //  By.xpath("select[name='theme']");


private By AllowUsers=
        By.id("allowAuthRezzervi");

private By GoogleUsers= 
        By.id("allowAuthGoogle");


private By Microsoft = 
        By.id("allowAuthMicrosoft");


private By EntraID = 
        By.id("allowAuthMicrosoft");

private By LibrayID = 

        By.id("allowAuthITSDS");
      
private	By submitButton = 
        By.cssSelector("button[type='submit']");

private By validationMessage =
        By.xpath("//p[contains(@class,'message-dialog') and normalize-space()='Invalid entry!']");
		


// methods 
	public void clickAdminMenu() {
		 wait.until(ExpectedConditions.elementToBeClickable(adminMenu)).click();
	}

 
// organisation 
	
	public void clickOrganisation() {
	
		 wait.until(ExpectedConditions.elementToBeClickable(organisation)).click();
	}
		
	

	
public void SelectLanguage(String value) {
	
	Select select = new Select(getElement (language));
	select.selectByVisibleText(value);
	
}
	



	
// Time Zone 
	
public void selectTimeZone(String value) {
	
	Select select = new Select(getElement (timeZone));
	select.selectByVisibleText(value);
	
}


public boolean  isTimeZoneDisplayed() {
	
	return isDisplayed (timeZone);
	
	
}
// Advanced Option 

public void clickAdvancedOption() {
	
	click(advancedOption);
}



/*public void SelectTheme(String value) {
	
	 Select select = new Select(
             wait.until(ExpectedConditions.visibilityOfElementLocated(Theme)));

     select.selectByVisibleText(value);
	
}
*/

// check box 


public void enableCheckBox(String id) {
	
	By locator = By.id(id);
	
	if(!getElement(locator).isSelected()) {
		
		click(locator);
	}

	}

// negative scenario 


public void disableCheckbox(String id ) {
	
	By locator = By.id(id);
	
if(getElement(locator).isSelected()) {
		
		click(locator);
	}

	}	




public void clickSubmit() {
	
	click(submitButton);
	
}


	public boolean isDisplayedSubmit() {
		
		return isDisplayed(submitButton);
	
}

// Assertation 
	
	public String getValidationMessage() {

	    WebElement message = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    validationMessage
	            )
	    );

	    return message.getText().trim();
	}
	
}

	   