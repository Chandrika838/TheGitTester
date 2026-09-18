package automation.pages.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentListener implements ITestListener {

    private static ExtentReports extent =
            ExtentManager.getReport();

    private static ThreadLocal<ExtentTest> test =
            new ThreadLocal<ExtentTest>();


    // Get the current test
    public static ExtentTest getTest() {
        return test.get();
    }


    @Override
    public void onTestStart(ITestResult result) {

        String testName =
                result.getMethod().getMethodName();

        String description =
                result.getMethod().getDescription();

        ExtentTest extentTest =
                extent.createTest(testName);

        test.set(extentTest);


        // Test Scenario
        if (description != null && !description.isEmpty()) {

            extentTest.info(
                    "<b>Test Scenario:</b><br>" +
                    description
            );
        }
    }


    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass(
                "<b>Test Result:</b> PASSED"
        );
    }


    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(
                "<b>Test Result:</b> FAILED"
        );

        if (result.getThrowable() != null) {

            test.get().fail(
                    "<b>Failure Details:</b><br>" +
                    result.getThrowable().getMessage()
            );
        }
    }


    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().skip(
                "<b>Test Result:</b> SKIPPED"
        );
    }


    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}