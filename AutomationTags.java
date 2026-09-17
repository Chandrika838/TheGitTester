package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;

public class AutomationTags extends BasePage{

	public AutomationTags(WebDriver driver) {
		
		super(driver);
	}
	
//
	
	// locators 
		
		private By admin =
	            By.xpath("//span[normalize-space()='Admin']");

	    private By tools =
	            By.xpath("//span[normalize-space()='Tools']");
	    
	    
	    private By UsersTools =
	    		By.xpath("//button[normalize-space()='User Tools']");
	    
	    
	    
	    private By Adminpolicy = 
	    		By.xpath("//button[normalize-space()='Admin Policy Rules']");
	    
	    
	    private By Automation = 
	    		By.xpath("//span[@title='Automation Tags']");
	    
	    
	    private By General = 
	    		By.xpath("//button[normalize-space()='general rules']");
	    
	    
	    private By userreports = 
	    		By.id("adminPolicyCanAccessUserReportsIsDefined");
	    
	    
	    private By toogle1 = 
	    		By.id("adminPolicyCanAccessUserReports");
	    
	    
	    private By rooms = 
	    		
	    		By.id("adminPolicyCanAccessRoomReportsIsDefined");
	    
	    private By toogle2 = 
	    		
	    		By.id("adminPolicyCanAccessRoomReports");
	    
	    
	    private By Desk = 
	    		By.id("adminPolicyCanAccessDeskReportsIsDefined");
	    
	    private By toogle3 = 
	    		By.id("adminPolicyCanAccessDeskReports");
	    
	    
	    private By computers = 
	    		By.id("adminPolicyCanAccessComputerReportsIsDefined");
	    
	    
	    private By toogle4 = 
	    		By.id("adminPolicyCanAccessComputerReports");
	    	
	    
	    
	    // Users Rules 
	    
	    private By Users=
	    		By.xpath("//button[normalize-space()='user rules']");
	    
	    
	    private By InviteUsers = 
	    		
	            By.id("adminPolicyInviteUsersIsDefined");
	    
	    private By importUsers =
	    		By.id("adminPolicyImportUserIsDefined");
	    
	    private By Toogle = 
	    		
	    		By.id("adminPolicyImportUser");
	    
	    private By createUsers = 
	    		
	    		By.id("adminPolicyCreateGuestUserIsDefined");
	    
	    
	    private By SuspendUsers =
	    		By.id("adminPolicySuspendUserIsDefined");
	    
	    
	    private By toogle5 =
	    		By.id("adminPolicySuspendUser");
	    
	    
	    private By unlockusers = 
	    		By.id("adminPolicyUnlockUserIsDefined");
	    
	    
	    private By toogle6 =
	    		By.id("adminPolicyUnlockUser");
	    
	    
	    // rooms
	    
	    private By Rooms = 
	    		By.xpath("//button[normalize-space()='room rules']");
	    
	    
	    
	    private By makeunavliable = 
	    		By.id("adminPolicyRoomMakeUnavailableIsDefined");
	    
	    
	    private By deskrules=
	    		
	    		By.xpath("//button[normalize-space()='desk rules']");
	    
	    
	    private By makeunavliable1 =
	    		By.id("adminPolicyDeskMakeUnavailableIsDefined");
	    
	    
	    private By toogle7 = 
	    		By.id("adminPolicyDeskMakeUnavailable");
	    
	    
	    // computers 
	    
	    
	    private By computers1 = 
	    		By.xpath("//button[normalize-space()='computer rules']");
	    
	    
	    private By unavaliable = 
	    		By.id("adminPolicyComputerMakeUnavailableIsDefined");
	    
	    
	    private By toogle8 =
	    		By.id("adminPolicyComputerMakeUnavailable");
	    
	    
	    private By Update = 
	    		By.xpath("//button[@type='submit']");
	    
	    
	    
	    // methods 
	    
	 // Admin
	    public void ClickAdmin() {
	        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
	    }

	    // Tools
	    public void ClickTools() {
	        wait.until(ExpectedConditions.elementToBeClickable(tools)).click();
	    }

	    // User Tools
	    public void ClickUsersTools() {
	        wait.until(ExpectedConditions.elementToBeClickable(UsersTools)).click();
	    }

	    // Admin Policy Rules
	    public void ClickAdminPolicy() {
	        wait.until(ExpectedConditions.elementToBeClickable(Adminpolicy)).click();
	    }

	    // Automation Tag
	    public void ClickAutomation() {
	        wait.until(ExpectedConditions.elementToBeClickable(Automation)).click();
	    }

	    // General Rules
	    public void ClickGeneralRules() {
	        wait.until(ExpectedConditions.elementToBeClickable(General)).click();
	    }

	    // User Reports
	    public void ClickUserReports() {
	        wait.until(ExpectedConditions.elementToBeClickable(userreports)).click();
	    }

	    // Toggle 1
	    public void ClickToggle1() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle1));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    
	    public boolean isDisplayedToogle1() {
	    	return isDisplayed(toogle1);
	    	
	    }
	    
	    // Room Reports
	    public void ClickRoomReports() {
	        wait.until(ExpectedConditions.elementToBeClickable(rooms)).click();
	    }

	    // Toggle 2
	    public void ClickToggle2() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle2));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }
	    
	    
	    public boolean isDisplayedToogle2() {
	    	
	    	return isDisplayed(toogle2);
	    }

	    // Desk Reports
	    public void ClickDeskReports() {
	        wait.until(ExpectedConditions.elementToBeClickable(Desk)).click();
	    }
	    
	    

	    // Toggle 3
	    public void ClickToggle3() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle3));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    
	    public boolean isDisplayedToogle3() {
	    	
	    	return isDisplayed(toogle3);
	    }
	    
	    
	    // Computer Reports
	    public void ClickComputerReports() {
	        wait.until(ExpectedConditions.elementToBeClickable(computers)).click();
	    }

	    
	    
	    // Toggle 4
	    public void ClickToggle4() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle4));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    
	    
	    // User Rules
	    public void ClickUserRules() {
	        wait.until(ExpectedConditions.elementToBeClickable(Users)).click();
	    }

	    
	    
	    
	    // Invite Users
	    public void ClickInviteUsers() {
	        wait.until(ExpectedConditions.elementToBeClickable(InviteUsers)).click();
	    }
	    

	    // Import Users
	    public void ClickImportUsers() {
	        wait.until(ExpectedConditions.elementToBeClickable(importUsers)).click();
	    }

	    
	    // Create Users
	    public void ClickCreateUsers() {
	        wait.until(ExpectedConditions.elementToBeClickable(createUsers)).click();
	    }

	    
	    public void ClickToogle() {
	    	 WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(Toogle));
	         if (!toggle.isSelected()) {
	             toggle.click();
	         }
	     }

	    
	    
	    // Suspend Users
	    public void ClickSuspendUsers() {
	        wait.until(ExpectedConditions.elementToBeClickable(SuspendUsers)).click();
	    }
	    

	    // Toggle 5
	    public void ClickToggle5() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle5));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    // Unlock Users
	    public void ClickUnlockUsers() {
	        wait.until(ExpectedConditions.elementToBeClickable(unlockusers)).click();
	    }

	    // Toggle 6
	    public void ClickToggle6() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle6));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    // Room Rules
	    public void ClickRoomRules() {
	        wait.until(ExpectedConditions.elementToBeClickable(Rooms)).click();
	    }

	    // Make Room Unavailable
	    public void ClickMakeUnavailableRoom() {
	        wait.until(ExpectedConditions.elementToBeClickable(makeunavliable)).click();
	    }

	    // Desk Rules
	    public void ClickDeskRules() {
	        wait.until(ExpectedConditions.elementToBeClickable(deskrules)).click();
	    }

	    // Make Desk Unavailable
	    public void ClickMakeUnavailableDesk() {
	        wait.until(ExpectedConditions.elementToBeClickable(makeunavliable1)).click();
	    }

	    // Toggle 7
	    public void ClickToggle7() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle7));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    // Computer Rules
	    public void ClickComputerRules() {
	        wait.until(ExpectedConditions.elementToBeClickable(computers1)).click();
	    }

	    // Make Computer Unavailable
	    public void ClickMakeUnavailableComputer() {
	        wait.until(ExpectedConditions.elementToBeClickable(unavaliable)).click();
	    }

	    // Toggle 8
	    public void ClickToggle8() {
	        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toogle8));
	        if (!toggle.isSelected()) {
	            toggle.click();
	        }
	    }

	    
	    public boolean isDisplayedUpdated() {
	    	
	    	return isDisplayed(Update);
	    	
	    }
	    
	    // Update
	    public void ClickUpdate() {
	        wait.until(ExpectedConditions.elementToBeClickable(Update)).click();
	    }
	  		
	    
	}

    

