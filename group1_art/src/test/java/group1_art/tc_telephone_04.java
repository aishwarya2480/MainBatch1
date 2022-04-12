package group1_art;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_telephone_04 {
  @Test
	public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		
		while(rs.next()) {
			testcase8(rs.getField("email"));
	}
}public void testcase8(String email) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport7.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test8 = extent.createTest("TC_TELEPHONE_004");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			tc.enteremailc(email);
			if(driver.getPageSource().contains("Contact Us")) {
				System.out.println("Passed:Contact form should allow user to enter email in email feild");
				test8.pass("Contact form should allow user to enter email in email feild");
			}else {
				System.out.println("Failed: Contact form is not  allowing user to enter email in email feild");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src8= sshot.getScreenshotAs(OutputType.FILE);
				File dest8 = new File("./pic8.png");
				FileHandler.copy(src8, dest8);
				test8.fail("Contact form is not  allowing user to enter email in email feild",MediaEntityBuilder.createScreenCaptureFromPath("pic8.png").build());
			}
			driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
