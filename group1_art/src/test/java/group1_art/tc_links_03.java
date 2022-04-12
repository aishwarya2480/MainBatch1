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

public class tc_links_03 {
  @Test
  public void testcase3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport2.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test3 = extent.createTest("TC_LINKS_003");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clickcart();
			if(driver.getPageSource().contains("Shopping Cart")){
				System.out.println("shopping option should be clickabke and user should be able to navigate to shopping page");
				test3.pass("shopping option should be clickabke and user should be able to navigate to shopping page");
			}else {
				System.out.println("Failed: My WishList failed");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src3= sshot.getScreenshotAs(OutputType.FILE);
				File dest3 = new File("./pic3.png");
				FileHandler.copy(src3, dest3);
				test3.fail("My WishList failed",MediaEntityBuilder.createScreenCaptureFromPath("pic3.png").build());
			}driver.quit();
			extent.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
