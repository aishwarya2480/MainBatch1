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

public class tc_telephone_07 {
  @Test
  public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		
		while(rs.next()) {
			testcase11(rs.getField("name"),rs.getField("email"),rs.getField("enquiry"));
	}
}public void testcase11(String name,String email, String enquiry) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport10.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test11 = extent.createTest("TC_TELEPHONE_001");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			tc.enternamec(name);
			tc.enteremailc(email);
			tc.enterenquiry(enquiry);
			if(driver.getPageSource().contains("Contact Us")){
				System.out.println("Passeed:Submit button should be clickabke and user should be able to navigate to next page");
				test11.pass("Telephone option should be clickabke and user should be able to navigate to telephone page");
			}else {
				System.out.println("Failed:Submit button failed ");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src11= sshot.getScreenshotAs(OutputType.FILE);
				File dest11 = new File("./pic11.png");
				FileHandler.copy(src11, dest11);
				test11.fail("Telephone page failed to load",MediaEntityBuilder.createScreenCaptureFromPath("pic11.png").build());
				
			}
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();

		
	}
}
}

