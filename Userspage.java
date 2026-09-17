package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;


public class Userspage extends BasePage {

	public Userspage(WebDriver driver) {
		
		super(driver);
	}
	
// locators 
	
	private By admin =
    		By.xpath("//span[normalize-space()='Admin']");
    
    private By tools = 
    		By.xpath("//span[normalize-space()='Tools']");
    
    // Users 
    
    private By Users = 
    		By.xpath("//button[normalize-space()='User Tools']");
    
    private By Tags = 
    		By.cssSelector("div[class='collapse show'] button:nth-child(3)");
   
    private By Tool = 
    		By.xpath("//span[@title='Automation Tags']");
    
   
    private By Rooms = 
    		By.xpath("//button[normalize-space()='room booking rules']");
    
   
    private By Computers = 
    		By.xpath("//button[normalize-space()='computer booking rules']");
    
    
    private By Deskprofile = 
    		By.xpath("//button[normalize-space()='desktop profiles']");
    
    
    private By AdminPolicy = 
    		By.xpath("//button[normalize-space()='admin policy rules']");
    
    private By Update = 
    		
    		By.xpath("//span[normalize-space()='Update']");
    
    
    // methods 
    
    
    public void ClickAdmin() {
    	
 	   wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
 
 }
 
 public void ClickTools() {
 	
 	   wait.until(ExpectedConditions.elementToBeClickable(tools)).click();

 }
 
 
 public void ClickUsers() {
 	
 	   wait.until(ExpectedConditions.elementToBeClickable(Users)).click();
 

 }
 
 
 public void ClickTags() {
 	
 	   wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();
 
 }

	   public void ClickTool() {

		    WebElement button = wait.until(
		            ExpectedConditions.presenceOfElementLocated(Tool));

		    ((JavascriptExecutor) driver)
		            .executeScript("arguments[0].click();", button);
		}


	   public void ClickBookingRules() {

   	    WebElement button = wait.until(
   	            ExpectedConditions.presenceOfElementLocated(Rooms));

   	    ((JavascriptExecutor) driver)
   	            .executeScript("arguments[0].click();", button);
   	}
      

	   public void ClickBookingRules1() {

   	    WebElement button = wait.until(
   	            ExpectedConditions.presenceOfElementLocated(Computers));

   	    ((JavascriptExecutor) driver)
   	            .executeScript("arguments[0].click();", button);
   	}
      


	   public void ClickBookingRules2() {

   	    WebElement button = wait.until(
   	            ExpectedConditions.presenceOfElementLocated(Deskprofile));

   	    ((JavascriptExecutor) driver)
   	            .executeScript("arguments[0].click();", button);
   	}
	   
   
	   public void ClickBookingRules3() {

   	    WebElement button = wait.until(
   	            ExpectedConditions.presenceOfElementLocated(AdminPolicy));

   	    ((JavascriptExecutor) driver)
   	            .executeScript("arguments[0].click();", button);
   	}
      
     
	   
	   public void ClickUpdate() {

   	    WebElement button = wait.until(
   	            ExpectedConditions.presenceOfElementLocated(Update));

   	    ((JavascriptExecutor) driver)
   	            .executeScript("arguments[0].click();", button);
   	}
      
      
      public boolean isDisplayedUpdate() {
   	   
   	   return isDisplayed(Update);
   	   
   	   
      }
      
}
	   
	   
