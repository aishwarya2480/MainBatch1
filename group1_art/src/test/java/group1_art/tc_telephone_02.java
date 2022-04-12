package group1_art;

import java.io.File;

import org.openqa.selenium.By;
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

public class tc_telephone_02 {
  @Test
	public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		
		while(rs.next()) {
			testcase6(rs.getField("name"));
	}
}public void testcase6(String name) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport5.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test6 = extent.createTest("TC_TELEPHONE_002");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			tc.enternamec(name);
			if(driver.getPageSource().contains("Contact Us")) {
				System.out.println("Passed: Contact form should allow user to enter name in name feild");
				test6.pass("Contact form should allow user to enter name in name feild");
			}else {
				System.out.println("Failed: Contact form is not allowing to enter name");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src6= sshot.getScreenshotAs(OutputType.FILE);
				File dest6 = new File("./pic6.png");
				FileHandler.copy(src6, dest6);
				test6.fail("Contact form is not  allowing user to enter name in name feild",MediaEntityBuilder.createScreenCaptureFromPath("pic6.png").build());
			}driver.quit();
			extent.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
