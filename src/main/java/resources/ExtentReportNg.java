package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {
	static ExtentReports report;
	
	
	public static ExtentReports getReportobj()
	{
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter ptr = new ExtentSparkReporter(path);
		ptr.config().setReportName("Test Automation Result");
		ptr.config().setDocumentTitle("Test Result");
		
		report = new ExtentReports();
		report.attachReporter(ptr);
		report.setSystemInfo("QA Analyst", "Subham Nayak");
		return report;
		
	}

}
