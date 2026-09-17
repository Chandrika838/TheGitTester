package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

// locators 
    
    // now we using all the locatrs to use them  in the methods 
    
  private By email = By.id("email");
  
  private By password = By.id("password");
  
  private By highContrastSwitch = By.id("highContrastSwitch");
 
  private By loginButton = By.cssSelector("button.btn-login");
  
  private By ErrorMessage = By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");
   
  // We are Methods
  
  public void enterEmail(String userEmail) {
	  
	  enterText(email, userEmail);
	  
  }
  
  public void enterPassword(String userPassword) {
	  enterText(password, userPassword);
	  
  }
  
  
  public void enableHighContrast() {

      if (!getElement(highContrastSwitch).isSelected()) {
          click(highContrastSwitch);
          
   
      }
  }


  public boolean isHighContrastEnabled() {
	    return getElement(highContrastSwitch).isSelected();
	}

	public boolean isLoginButtonDisplayed() {
	    return getElement(loginButton).isDisplayed();
	}
  
 public void clickLogin() {
	 
	 click(loginButton);
	 
	 
 }
 
 
 public boolean isLoginDisplayed() {
	 
	 return getElement(loginButton).isDisplayed();
 }
  
 
 // resuable login Method 
 
 
 public void login(String emailAddress, String passwordValue) {
	 
	 enterEmail(emailAddress);
	 
	 enterPassword(passwordValue);
	 
	 enableHighContrast();
	 
	 clickLogin();
	 
 }
	 
	 public boolean isDisplayedLogin() {
		 
		 return isDisplayed(loginButton);
	 
	
 }
	 
public boolean isErrorMessageDisplayed() {
	
	return isDisplayed(ErrorMessage);
}


public boolean isInvalidMessageDisplayed() {
	
	return isDisplayed(ErrorMessage);
}


public boolean isInvalidPasswordDisplayed() {
	
	return isDisplayed(ErrorMessage);
}
 
 }
  