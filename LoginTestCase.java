package testcase;

import automation.pages.utils.ConfigReader;
import automation.pages.utils.ExtentListener;

import adminpage.DashboardPage;
import adminpage.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseTest {

    ConfigReader config = new ConfigReader();


    @Test(
        description =
        "Verifies that an administrator can successfully log in using valid credentials and access the MYPC Dashboard."
    )
    public void verifyValidLogin() {

       
        // Scenarios Covered
    

        ExtentListener.getTest().info(
                "<b>Scenarios Covered:</b>"
        );

        ExtentListener.getTest().info(
                "• Enter valid administrator email"
        );

        ExtentListener.getTest().info(
                "• Enter valid administrator password"
        );

        ExtentListener.getTest().info(
                "• Enable High Contrast mode"
        );

        ExtentListener.getTest().info(
                "• Verify High Contrast mode is enabled"
        );

        ExtentListener.getTest().info(
                "• Click Login"
        );

        ExtentListener.getTest().info(
                "• Verify Dashboard is displayed"
        );

        ExtentListener.getTest().info(
                "• Verify logged-in username is displayed"
        );

        ExtentListener.getTest().info(
                "• Verify logged-in username is not empty"
        );

        // Expected Result
    
        ExtentListener.getTest().info(
                "<b>Expected Result:</b><br>" +
                "Administrator should successfully log in and " +
                "access the MYPC Dashboard."
        );

        // Test Execution

        LoginPage loginPage =
                new LoginPage(driver);


        ExtentListener.getTest().info(
                "Enter valid administrator email"
        );

        loginPage.enterEmail(
                config.getEmail()
        );


        ExtentListener.getTest().info(
                "Enter valid administrator password"
        );

        loginPage.enterPassword(
                config.getPassword()
        );


        ExtentListener.getTest().info(
                "Enable High Contrast mode"
        );

        loginPage.enableHighContrast();


        ExtentListener.getTest().info(
                "Verify High Contrast mode is enabled"
        );

        Assert.assertTrue(
                loginPage.isHighContrastEnabled(),
                "Enable is not High Contrast"
        );


        ExtentListener.getTest().info(
                "Click Login"
        );

        loginPage.clickLogin();


        DashboardPage dashboardPage =
                new DashboardPage(driver);


        ExtentListener.getTest().info(
                "Verify Dashboard is displayed"
        );

        Assert.assertTrue(
                dashboardPage.isLoggedInUserNameDisplayed(),
                "Logged-in user name is not displayed on the dashboard"
        );


        ExtentListener.getTest().info(
                "Verify logged-in username is not empty"
        );

        Assert.assertFalse(
                dashboardPage.getLoggedInUserName().isEmpty(),
                "Logged-in user name is empty"
        );


        // -----------------------------------
        // Actual Result
        // -----------------------------------

        ExtentListener.getTest().info(
                "<b>Actual Result:</b><br>" +
                "Administrator successfully logged in and " +
                "the logged-in username was displayed on the Dashboard."
        );
    }
}