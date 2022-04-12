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

public class tc_links_04 {
  @Test
  public void testcase4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport3.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test4 = extent.createTest("TC_LINKS_004");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clickcheckout();
			if(driver.getPageSource().contains("Shopping Cart")){
				System.out.println("Passed : Checkout option should be clickabke and user should be able to navigate to checkout page");
				test4.pass("Checkout option should be clickabke and user should be able to navigate to checkout page");
			}else {
				System.out.println("Faied:My Checkout failed");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src4= sshot.getScreenshotAs(OutputType.FILE);
				File dest4 = new File("./pic4.png");
				FileHandler.copy(src4, dest4);
				test4.fail("My Checkout failed",MediaEntityBuilder.createScreenCaptureFromPath("pic4.png").build());
				
			}driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
