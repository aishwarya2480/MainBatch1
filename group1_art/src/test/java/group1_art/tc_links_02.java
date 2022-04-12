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

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_links_02 {
  @Test
  public void testcase2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport1.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test2 = extent.createTest("TC_LINKS_002");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clickwish();
			if(driver.getPageSource().contains("Returning Customer")){
				test2.pass("WishList option should be clickabke and user should be able to navigate to my account page");
			}else {
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src2= sshot.getScreenshotAs(OutputType.FILE);
				File dest2 = new File("./pic2.png");
				FileHandler.copy(src2, dest2);
				test2.fail("My WishList failed",MediaEntityBuilder.createScreenCaptureFromPath("pic2.png").build());
				driver.quit();
				
			}
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
