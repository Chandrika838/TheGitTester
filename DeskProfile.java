package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class DeskProfile extends BasePage {

	public DeskProfile(WebDriver driver) {
		
		super(driver);
		
	}
	
	
// locators
	
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");
    
    private By Computers =
    		By.xpath("//button[normalize-space()='Computer Tools']");
    
    private By DeskProfile= 
    		By.xpath("//button[normalize-space()='Desktop Profiles']");
    				
    
	private By AddNew = 
	        By.xpath("//button[@class='link-button']");
	
	private By UserTags =
			By.id("userTagId");
	
	private By ComputerTaags = 
			By.id("resourceTagId");
	
	
	private By Submit =
	        By.xpath("//button[@type='submit']");
	
	
	private By AutomationTags =
			By.xpath("//span[@title='Automation Tags']");
	
	private By context=
			By.xpath("//input[@formcontrolname='context']");
	private By Username = 
			By.xpath("//input[@formcontrolname='userName']");
	
	
	private By Password =
			By.xpath("//input[@formcontrolname='password']");
	
	private By Update = 
			By.xpath("//button[@type='submit']");
	// methods
	
	
	public void ClickAdmin() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }
    
	
	public void ClickTools() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }
    
	
	public void Clickcomputers( ) {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Computers)).click();
    }
    
	public void Clickdeskprofile() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(DeskProfile)).click();
    }
    
	
	public  void ClickAddnew() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(AddNew)).click();
    }
    
	
	public void SelectUsertags(String value) {
		
		 WebElement dropdown = wait.until(
		            ExpectedConditions.elementToBeClickable(UserTags));

		 Select select = new Select(dropdown);
		 
		 select.selectByVisibleText(value);
    }
	
    
	
	public void SelectComputerstags(String value) {
		
		 WebElement dropdown1 = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(ComputerTaags));
		 
		 Select select = new Select(dropdown1);
		 
		 select.selectByVisibleText(value);
    }
    
	
    
	public void ClickSubmit() {

	    wait.until(ExpectedConditions.elementToBeClickable(Submit));

	    driver.findElement(Submit).click();
	}
    
	
	public boolean isDisplayed() {
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(UserTags)).isDisplayed();
	}
	
	
	public boolean isComputerDisplayed() {
		
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(ComputerTaags)).isDisplayed();
		
	}
	
	
	public boolean isContinueDisplayed() {
		
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(Submit)).isDisplayed();
	}
	
	
	public void ClickAutomationTags() {
	
		 wait.until(ExpectedConditions.elementToBeClickable(AutomationTags)).click();
    }
    
	
	public void enternameContext(String value) {
		
		 wait.until(ExpectedConditions.elementToBeClickable(context)).click();
    }
    
	
	public void enternameUsername(String value) {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Username)).click();
    }
    
	
	public void enternamePassword(String value) {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Password)).click();
    }
    
	
	public void ClickUpdate() {
		
		 wait.until(ExpectedConditions.elementToBeClickable(Update)).click();
    }
    
	}
	

	
	
	
	
	
	
	

