package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BasePage;
import java.time.Duration;


public class ComputerLocationProperties extends BasePage {
	
public ComputerLocationProperties(WebDriver driver) {

	super(driver);
}

// locators 

private By Admin =
        By.xpath("//span[normalize-space()='Admin']");

private By Tools =
        By.xpath("//span[normalize-space()='Tools']");

private By ComputerTools =
        By.xpath("//button[normalize-space()='Computer Tools']");

private By CopyProperties =
        By.xpath("//div[@class='collapse show']//button[@type='button'][normalize-space()='Copy Properties']");


private By Source = 
        By.name("sourceId");


private By Target = 
        By.xpath("//select[@id='selectedLocationId']");

private By Tags = 
        By.id("tag_0ef3823b-0add-47b1-81ab-019f93b64cff");


private By Tags1 =
        By.id("bfb426b4-52e0-4b3b-ae4e-01a057594a3d");


private By Location =
        By.id("setting_LOCATION");


private By defaultlocation =
        By.id("setting_DEFAULT_DURATION");

private By allowedBookingMethod =
        By.id("setting_ALLOWED_BOOKING_METHODS");

private By Prepartiontime = 
        By.id("setting_PREPARATION_TIME");


private By CheckinSetting =
        By.id("setting_CHECK_IN_SETTINGS");


private By level1time = 
        By.id("setting_LEVEL1_WARNING_MESSAGE");


private By level2time =
        By.id("setting_LEVEL1_WARNING_MESSAGE");


private By level3time =
        By.id("setting_LEVEL3_WARNING_MESSAGE");


private By logginglevel= 
        By.id("setting_LOGGING_LEVEL");


private By WelcomeMessage = 
        By.id("setting_WELCOME_MESSAGE");


private By aupMessage = 
        By.id("setting_AUP_MESSAGE");


private By allowAutoRebot=
        By.id("setting_AUTO_REBOOT_AT_LOGOFF");


private By allowAutoShutdown = 
        By.id("setting_AUTO_SHUTDOWN_AT_CLOSING_TIME");


private By incativitytimenout = 
        By.id("setting_INACTIVITY_TIMEOUT");


private By locktimeout = 
        By.id("setting_LOCK_TIMEOUT");

private By tags = 
        By.id("setting_TAGS");

private By copy  =
        By.xpath("//button[@type='submit']");


// methods 



public void ClickAdmin() {
 	
 	wait.until(ExpectedConditions.elementToBeClickable(Admin)).click();
 }
 
 public void ClickTools() {
 	
 	wait.until(ExpectedConditions.elementToBeClickable(Tools)).click();
 }

 
public void ClickComputerTools() {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(ComputerTools)).click();
}
 
 
public void clickCopyProperties() {

    wait.until(
        ExpectedConditions.elementToBeClickable(CopyProperties)
    ).click();
}


public boolean CopyPropertiesisDisplayed() {
	return isDisplayed(CopyProperties);
	
}

public void selectSource(String sourceName) {

    WebDriverWait sourceWait =
            new WebDriverWait(driver, Duration.ofSeconds(30));

    WebElement sourceDropdown = sourceWait.until(
        ExpectedConditions.presenceOfElementLocated(Source)
    );

    sourceWait.until(
        ExpectedConditions.visibilityOf(sourceDropdown)
    );

    sourceWait.until(
        ExpectedConditions.elementToBeClickable(sourceDropdown)
    );

    Select select = new Select(sourceDropdown);

    select.selectByVisibleText(sourceName);
}

 
 
public void SelectSource(String value) {
	   
	   WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Source));

	    Select select = new Select(dropdown);
	    select.selectByVisibleText(value);
}
 
 
public void SelectLocation(String value ) {
	   
	   WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(Target));

	    Select select = new Select(dropdown);
	    select.selectByVisibleText(value);
	   
	  
}

public void enableTags() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Tags));

	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}


public boolean TagsisSelected() {
	return isSelected(Tags);
	
}

public void enableTags1() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Tags1));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}


public void enableLocation() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Location));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enabledfaulttime() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(defaultlocation));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}


public void enableallowedBookingMethod() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(allowedBookingMethod));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableprepartime() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(Prepartiontime));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablecheckinsetting() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(CheckinSetting));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablelevel1time() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(level1time));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablelevel2time() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(level2time));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablelevel3time() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(level3time));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablelogginglevel() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(logginglevel));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableWlecomeMessage() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(WelcomeMessage));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableaupMessage() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(aupMessage));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableAllowautoRebot() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(allowAutoRebot));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableallowAutoShutdown() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(allowAutoShutdown));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enableincativitytimenout() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(incativitytimenout));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enablelocktimeout() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(locktimeout));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void enabletags() {
	
	 WebElement checkbox = wait.until(
	            ExpectedConditions.elementToBeClickable(tags));
	
	 if(!checkbox.isSelected()) {
		 
		 checkbox.click();
	 }
}

public void ClickCopy() {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(copy)).click();
}


public boolean isDisplayed() {
	
	return isDisplayed(copy);
}
        
}
