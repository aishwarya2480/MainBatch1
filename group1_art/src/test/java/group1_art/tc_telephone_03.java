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

public class tc_telephone_03 {
  @Test
  public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		String strquery1 = "Select name from Sheet1";
		Recordset rs1 = con.executeQuery(strquery);
		
		while(rs.next()) {
			testcase7(rs.getField("name"));
	}
}public void testcase7(String name) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport6.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test7 = extent.createTest("TC_TELEPHONE_003");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			tc.enternamec(name);
			int j = 0;
			for(int i=0;i<name.length();i++) {
				if(Character.isDigit(i)) {
					j=j+1;
				}else {
					j=0;
				}
			}
			if(j==0) {
				System.out.println("Passed:Contact form is not allowing numbers to fill in name field");
				test7.pass("Contact form is not allowing numbers to fill in name field");
			}else {
				System.out.println("Failed: Contact form should not allow user to enter numbers in name feild");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src7= sshot.getScreenshotAs(OutputType.FILE);
				File dest7 = new File("./pic7.png");
				FileHandler.copy(src7, dest7);
				test7.fail("Contact form should not allow user to enter numbers in name feild",MediaEntityBuilder.createScreenCaptureFromPath("pic7.png").build());
			}
			driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
