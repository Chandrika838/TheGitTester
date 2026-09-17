package automation.pages.utils;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// this class is used to create and manage the report in the automation framework 
public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReport() {

        if(extent==null) {

        	// this connect all the test case and create a report 
            ExtentSparkReporter spark =
                    new ExtentSparkReporter("test-output/MYPC_Report.html");

            spark.config().setReportName("MYPC Automation Report");
            spark.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();

            // creating a report then connect with the spark and extent report 
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "MYPC");
            extent.setSystemInfo("Tester", "Chandrika");
            extent.setSystemInfo("Browser", "Chrome");
            extent.setSystemInfo("Environment", "QA");

        }

        return extent;

    }

}