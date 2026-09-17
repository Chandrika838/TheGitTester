package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class DeskBookingRulestags extends BasePage {
 
 public DeskBookingRulestags (WebDriver driver) {
	 
	 super(driver);
	 
 }
 
 
 // locators
 
 private By admin =
 		By.xpath("//span[normalize-space()='Admin']");
 
 private By tools = 
 		By.xpath("//span[normalize-space()='Tools']");
 
 
 private By Desk = 
 		By.xpath("//button[normalize-space()='Desk Tools']");
 
 
 private By Tags = 
 		By.cssSelector("div[class='collapse show'] button:nth-child(3)");

 
 
 private By Tools = 
 		By.xpath("//span[@title='Chandrika user Tags']");
 
 
 private By BookingRules = 
 		By.xpath("//button[normalize-space()='desk booking rules']");
 
 
 private By AddNew = 
 		By.xpath("//button[@type='button'][normalize-space()='Add New']");
 
 
 private By ID = 
 		By.id("userTagId");
 
 
 private By Continue = 
 		By.xpath("//span[normalize-space()='Continue']");
 
 private By Update = 
 		By.xpath("//form[@id='relationTagForm']//span[contains(text(),'Update')]");

 private By Update1=
 		
 		By.xpath("//span[normalize-space()='Update']");

 
 
 // methods 
 
 
 public void ClickAdmin() {
 	
	   wait.until(ExpectedConditions.elementToBeClickable(admin)).click();

}

public void ClickTools() {
	
	   wait.until(ExpectedConditions.elementToBeClickable(tools)).click();

}


public void ClickDesk() {
	
	   wait.until(ExpectedConditions.elementToBeClickable(Desk)).click();


}


public void ClickTags() {
	
	   wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();

}

 public void ClickTool() {

	    WebElement button = wait.until(
	            ExpectedConditions.presenceOfElementLocated(Tools));

	    ((JavascriptExecutor) driver)
	            .executeScript("arguments[0].click();", button);
	}




public void ClickBookingRules() {

  WebElement button = wait.until(
          ExpectedConditions.presenceOfElementLocated(BookingRules));

  ((JavascriptExecutor) driver)
          .executeScript("arguments[0].click();", button);
}



public void ClickAddNew() {

  WebElement addButton = wait.until(
          ExpectedConditions.presenceOfElementLocated(AddNew));

  ((JavascriptExecutor) driver)
          .executeScript("arguments[0].scrollIntoView(true);", addButton);

  ((JavascriptExecutor) driver)
          .executeScript("arguments[0].click();", addButton);
}


public boolean isDisplayedAddNew() {
 
 return isDisplayed(AddNew);
 
 
}

public void SelectID(String value) {

  WebElement dropdown = wait.until(
          ExpectedConditions.presenceOfElementLocated(ID));

  Select select = new Select(dropdown);

  select.selectByVisibleText(value);
}



public void ClickContinue() {

  WebElement button = wait.until(
          ExpectedConditions.presenceOfElementLocated(Continue));

  ((JavascriptExecutor) driver)
          .executeScript("arguments[0].click();", button);
}  


public boolean isDisplayedContinue() {
 
 return isDisplayed(Continue);
 
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



public void ClickUpdate1() {

  WebElement button = wait.until(
          ExpectedConditions.presenceOfElementLocated(Update1));

  ((JavascriptExecutor) driver)
          .executeScript("arguments[0].click();", button);
}


public boolean isDisplayedUpdate1() {
 
 return isDisplayed(Update1);
 
}


 
 
	
}
