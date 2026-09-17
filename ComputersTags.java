package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class ComputersTags extends BasePage {

    public ComputersTags(WebDriver driver) {
        super(driver);
    }

    // Locators

    private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By computerTools =
            By.xpath("//button[normalize-space()='Computer Tools']");

    private By ComputerTags = 
    	    By.cssSelector("div[class='collapse show'] button:nth-child(3)");
    

    private By addNew = 
    		By.xpath("//button[normalize-space()='Add New']");
    
    private By name =
            By.id("tagName");

    private By add =
            By.xpath("//button[@type='submit']");
    
    
    private By InvalidMessage = 
   		 By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");
    
    
    private By ErrorMessage = 
   		 By.xpath("//p[@class='message-dialog']");

    // Methods

    public void clickAdmin() {
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }

    public void clickComputerTools() {
        wait.until(ExpectedConditions.elementToBeClickable(computerTools)).click();
    }

    
    public void ClickTags() {
    	
 	   wait.until(ExpectedConditions.elementToBeClickable(ComputerTags)).click();
 

 }
 

 
 public void ClickAddNew() {

	
		    WebElement addNewButton = wait.until(
		            ExpectedConditions.elementToBeClickable(addNew));

		    ((JavascriptExecutor) driver)
		            .executeScript("arguments[0].click();", addNewButton);

		    // Wait for the popup input field
		    wait.until(ExpectedConditions.visibilityOfElementLocated(name));
		}
 
 
 public void enterComputerTags(String name) {

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
 
 
 public boolean isDisplayedSubmit() {
	 
	 return isDisplayed(add);
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
 
 
 
 
 
 
 
 
 
   