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

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_telephone_01 {
  @Test
  public void testcase5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport4.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test5 = extent.createTest("TC_TELEPHONE_001");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clicktele();
			if(driver.getPageSource().contains("Contact Us")){
				System.out.println("Passeed:Telephone option should be clickabke and user should be able to navigate to telephone page");
				test5.pass("Telephone option should be clickabke and user should be able to navigate to telephone page");
			}else {
				System.out.println("Failed:Telephone page failed to load ");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src5= sshot.getScreenshotAs(OutputType.FILE);
				File dest5 = new File("./pic5.png");
				FileHandler.copy(src5, dest5);
				test5.fail("Telephone page failed to load",MediaEntityBuilder.createScreenCaptureFromPath("pic5.png").build());
				
			}
			driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();

		
	}
  }
}
