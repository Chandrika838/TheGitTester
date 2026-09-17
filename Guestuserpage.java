package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class Guestuserpage extends BasePage {

    public Guestuserpage(WebDriver driver) {
        super(driver);
    }

    // =========================
    // LOCATORS
    // =========================

    private By Admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By Tools =
            By.xpath("//span[normalize-space()='Tools']");

    private By UsersTools =
            By.xpath("//button[normalize-space()='User Tools']");

    private By GuestUsers =
            By.xpath("//button[normalize-space()='Guest User Templates']");

    private By AddNew =
            By.xpath("//a[normalize-space()='Add New']");

    private By Name =
            By.xpath("//input[@formcontrolname='name']");

    private By Userprefix =
            By.xpath("//input[@formcontrolname='userPrefix']");

    private By Numberoffigures =
            By.id("userNameLength");

    // Password
    private By character =
            By.id("isPasswordAlphanumeric");

    private By length =
            By.id("passwordLength");

    private By Expxried =
            By.id("userExpiryPeriod");

    private By Numberofperiods =
            By.id("userExpiryValue");

    private By CheckBox =
            By.id("showExpiryInformation");

    private By Add =
    		By.xpath("//button[contains(text(),'Add')]");
    
    private By tags =
            By.xpath("//select[@name='selectedTag']");
    
    
    private By Activation =
            By.id("isActivatedOnLogin");

    private By Submit =
            By.xpath("//button[@type='submit']");
    
    
    
    private By ErrorMessage = 
    		By.xpath("//span[@class='fa-solid fa-circle-xmark failCircle']");


    
    private By InvalidMessage = 
    		
    		By.xpath("//p[@class='message-dialog']");
    
    // =========================
    // METHODS
    // =========================

    public void ClickAdmin() {

        wait.until(
                ExpectedConditions.elementToBeClickable(Admin)
        ).click();
    }


    public void ClickTools() {

        wait.until(
                ExpectedConditions.elementToBeClickable(Tools)
        ).click();
    }


    public void ClickUsers() {

        wait.until(
                ExpectedConditions.elementToBeClickable(UsersTools)
        ).click();
    }


    public void ClickGuestUsers() {

        wait.until(
                ExpectedConditions.elementToBeClickable(GuestUsers)
        ).click();
    }


    public void ClickAddNew() {

        wait.until(
                ExpectedConditions.elementToBeClickable(AddNew)
        ).click();
    }


    public void enterName(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Name)
        );

        textbox.clear();
        textbox.sendKeys(value);
    }


    public void enterPrefix(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Userprefix)
        );

        textbox.clear();
        textbox.sendKeys(value);
    }


    public void enterNumberofFigures(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Numberoffigures)
        );

        textbox.clear();
        textbox.sendKeys(value);
    }


    public void SelectCharacter(String value) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(character)
        );

        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }


    public void enterLength(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(length)
        );

        textbox.clear();
        textbox.sendKeys(value);
    }


    public void SelectExpired(String value) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Expxried)
        );

        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }


    public void enterNumberofperiods(String value) {

        WebElement textbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Numberofperiods)
        );

        textbox.clear();
        textbox.sendKeys(value);
    }


    public void ClickCheckbox() {

        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(CheckBox)
        );

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    public boolean isSelectedChedckbox() {

        return isSelected(CheckBox);
    }


  public void ClickAdd() {
	  
	  wait.until(
              ExpectedConditions.elementToBeClickable(Add)
      ).click();
  }

    
    public void SelectTags(String value) {

        WebElement dropdown = wait.until(
                ExpectedConditions.presenceOfElementLocated(tags)
        );

        wait.until(
                ExpectedConditions.visibilityOf(dropdown)
        );

        Select select = new Select(dropdown);

        select.selectByVisibleText(value);
    }



    public void SelectActivation(String value) {

        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(Activation)
        );

        Select select = new Select(dropdown);

        select.selectByVisibleText(value);
    }


    // =========================
    // SUBMIT
    // =========================

    public void ClickSubmit() {

        wait.until(
                ExpectedConditions.elementToBeClickable(Submit)
        ).click();
    }


    public boolean isDisplayedSubmit() {

        return isDisplayed(Submit);
    }
    
    
    
   public boolean isBlankNameDisplayed() {
	   
	   return isDisplayed(ErrorMessage);
	}

   
   public String getInvalidMessage() {
	   
	   WebElement message = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                  InvalidMessage
	            )
	    );
	   
	   return message.getText().trim();
   }
   
   
}




