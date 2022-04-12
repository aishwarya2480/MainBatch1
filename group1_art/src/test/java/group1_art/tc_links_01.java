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

public class tc_links_01 {
  @Test
	public void testcase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(reporter);
		ExtentTest test1 = extent.createTest("TC_LINKS_001");
		try {
			MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
			tc.clickonmyacc1();
			if(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul")).isDisplayed()){
				System.out.println("Passed: My account should be clickabke and user should be able to navigate to my account page");
				test1.pass("My account should be clickabke and user should be able to navigate to my account page");
			}else {
				System.out.println("Failed: My account failed");
				TakesScreenshot sshot = ((TakesScreenshot)driver);
				File src1 = sshot.getScreenshotAs(OutputType.FILE);
				File dest1 = new File("./pic1.png");
				FileHandler.copy(src1, dest1);
				test1.fail("My account failed",MediaEntityBuilder.createScreenCaptureFromPath("pic1.png").build());
				driver.quit();
				extent.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
