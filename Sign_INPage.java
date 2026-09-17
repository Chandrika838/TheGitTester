package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class Sign_INPage extends BasePage{

	public  Sign_INPage(WebDriver driver) {
		
		super(driver);
		
	}
	

// locators 
	
private By email = 
        By.cssSelector("#email");

private By password = 
        By.cssSelector("#password");
	
private By loginButton = 
        By.xpath("//button[@class='btn btn-default btn-login btn-main']");
	
private By 	profile = 
        By.xpath("//div[@class='navbar-initialsCircle mt-1 me-1']");
	
private By setting = 
        By.xpath("//span[normalize-space()='Settings']");

private By theme = 
        By.cssSelector("select[name='theme']");


private  By language= 

         By.cssSelector("select[name='language']");


private By Zoom= 

        By.cssSelector("select[name='zoomLevel']");



private By submit = 
        By.xpath("//span[normalize-space()='Update']");

private By signout = 
        By.xpath("//a[normalize-space()='Sign Out']");
	


// Methods 

public void enterEmail(String userEmail) {
	  
	  enterText(email, userEmail);
	  
}

public void enterPassword(String userPassword) {
	  enterText(password, userPassword);
	  
}


public void clickLogin() {
	click(loginButton);
}
	
	
public boolean isDisplayedLogin() {
	
	return isDisplayed(loginButton);
	
}


public void clickProfile() {
	wait.until(ExpectedConditions.elementToBeClickable(profile)).click();
		
}

	
public void ClickSetting() {
	
	wait.until(ExpectedConditions.elementToBeClickable(setting)).click();
}
	

public boolean isSettingDisplayed() {
	
	return isDisplayed(setting);
	
}

public void selectTheme(String themeName) {

    Select select = new Select(getElement(theme));

    select.selectByVisibleText(themeName);
	
	

}
	

public boolean isDisplayedTheme() {
	
	return isDisplayed(theme);
}



public void SelectLanguage(String value) {
	
	Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(language)));

    select.selectByVisibleText(value);

}



public void SelectZom(String value ) {
	
	Select select = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(Zoom)));

    select.selectByVisibleText(value);


}

public void clickSubmit() {
	
	click(submit);
	
}
	

public boolean isDisplayedSubmit() {
	
	return isDisplayed(submit);
	
}


public void clickSignout() {
	
	click(signout);
}
	

public boolean isDisplayedSignout() {
	
	return isDisplayed(signout);
	
}
}
