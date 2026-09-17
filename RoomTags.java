package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class RoomTags extends BasePage {

    public RoomTags(WebDriver driver) {
        super(driver);
   
    }

  // locators 
    
    private By admin =
    		By.xpath("//span[normalize-space()='Admin']");
    
    private By tools = 
    		By.xpath("//span[normalize-space()='Tools']");
    
    
    private By Room = 
    		By.xpath("//button[normalize-space()='Room Tools']");
    
    
    private By Tags = 
    		By.cssSelector("div[class='collapse show'] button:nth-child(3)");
    
    
    private By AddNew = 
    		By.xpath("//button[normalize-space()='Add New']");
    
    
    private By RoomTags = 
    		By.id("tagName");
    
    
    private By Submit = 
    		By.cssSelector("button[type='submit']");
    
    private By InvalidMessage = 
   		 By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");
    
    
    private By ErrorMessage = 
   		 By.xpath("//p[@class='message-dialog']");
    // Methods 
   
    // Methods 
    
    
    public void ClickAdmin() {
    	
    	   wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    
    }
    
    public void ClickTools() {
    	
    	   wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
   
    }
    
    
    public void ClickRoom() {
    	
    	   wait.until(ExpectedConditions.elementToBeClickable(Room)).click();
    

    }
    
    
    public void ClickTags() {
    	
    	   wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();
    

    }
    
    
    public void ClickAddNew() {

        WebElement addNewButton = wait.until(
                ExpectedConditions.elementToBeClickable(AddNew));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", addNewButton);

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(RoomTags));
    }
    
    
    
    public void enterRoomTags(String name) {

        WebElement input = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("tagName")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
            "arguments[0].value=arguments[1];" +
            "arguments[0].dispatchEvent(new Event('input'));" +
            "arguments[0].dispatchEvent(new Event('change'));",
            input,
            name
        );
    }
    
    
    public void clickAdd() {

        WebElement button = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("button[type='submit']")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                button);

        js.executeScript(
                "arguments[0].click();",
                button);
    }
    
    public boolean isInvalidMessageDisplayed() {
   	 
   	 return isDisplayed(ErrorMessage);
    }
    
    public String getInvalidMessage() {
   	 
   	 WebElement message = wait.until(
   	            ExpectedConditions.visibilityOfElementLocated(
   	                  ErrorMessage 
   	            )
   	    );
   	 
   	 return  message.getText().trim();
    }   
    
    
}