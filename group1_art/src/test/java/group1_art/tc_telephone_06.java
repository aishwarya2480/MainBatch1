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

public class tc_telephone_06 {
  @Test
  public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		
		while(rs.next()) {
			testcase10(rs.getField("enquiry"));
	}
}public void testcase10(String enquiry) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport9.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test10 = extent.createTest("TC_TELEPHONE_003");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			tc.enterenquiry(enquiry);
			int j = 0;
			for(int i=0;i<enquiry.length();i++) {
				if(enquiry.charAt(i)>='0' && enquiry.charAt(i)<=9) {
					j=1;
				}else {
					j=0;
				}
			}
			if(j==0) {
				System.out.println("Passed:Contact form is not allowing numbers to fill in enquiry field");
				test10.pass("Contact form is not allowing numbers to fill in enquiry field");
			}else {
				System.out.println("Failed: Contact form should not allow user to enter numbers in enquiry feild");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src10= sshot.getScreenshotAs(OutputType.FILE);
				File dest10 = new File("./pic10.png");
				FileHandler.copy(src10, dest10);
				test10.fail("Contact form should not allow user to enter numbers in enquiry feild",MediaEntityBuilder.createScreenCaptureFromPath("pic10.png").build());
			}
			driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}