package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class AdminPolicy extends BasePage{

	public AdminPolicy(WebDriver driver) {
		
		super(driver);
		
	}
	
	
	// locators 
	
	
	private By admin =
            By.xpath("//span[normalize-space()='Admin']");

    private By tools =
            By.xpath("//span[normalize-space()='Tools']");
    
    
    private By UsersTools =
    		By.xpath("//button[normalize-space()='User Tools']");
    
    
    
    private By Adminpolicy = 
    		By.xpath("//button[normalize-space()='Admin Policy Rules']");
    
    
    private By AddNew = 
    		By.xpath("//button[normalize-space()='Add New']");
    
    
    private By usertag = 
    		By.id("userTagId");
    
    
    private By adminPolicy =
    		By.id("resourceTagId");
    
    
   // private By Cancel =
    	//	By.xpath("//button[normalize-space()='Cancel']");
    
    
    private By Submit = 
    		By.xpath("//button[@type='submit']");
    
    
    // methods 
    
    
    public void ClickAdmin() {
    	
    	  wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
    }

    public void clickTools() {
        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
    }
    
    
    public void ClickUsersTools() {
    	
    	 wait.until(ExpectedConditions.elementToBeClickable(UsersTools)).click();
    }
    
    	
    
    
    public void ClickAdminpolicy() {
    	
    	  wait.until(ExpectedConditions.elementToBeClickable(Adminpolicy)).click();
    }

    
    public void ClickAddnew() {
    	
    	  wait.until(ExpectedConditions.elementToBeClickable(AddNew)).click();
    
    }
    
   
    
    public void selectUserTag(String value) {

        Select select = new Select(
                wait.until(ExpectedConditions.visibilityOfElementLocated(usertag)));

        select.selectByVisibleText(value);
    }
    
    
    
    public void SelectAdminPolicy(String value ) {
    	
    	Select select = new Select (
                wait.until(ExpectedConditions.visibilityOfElementLocated(adminPolicy)));

        select.selectByVisibleText(value);
    }
    

   
   // public void ClickCancel() {
    	
    	//  wait.until(ExpectedConditions.elementToBeClickable(Cancel)).click();
    	    
    	
   // }
    
    
    public void ClickSubmit() {
    	
    	  wait.until(ExpectedConditions.elementToBeClickable(Submit)).click();
  	    
    }    	
    	  
public boolean isSubmitDisplayed() {
    return isDisplayed(Submit);

}
}
    
    

