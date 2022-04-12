package group1_art;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class mainExttentReport {
	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport1.html");
			
			ExtentReports extent = new ExtentReports(); 
			
			
			extent.attachReporter(reporter);
			
			ExtentTest test1 = extent.createTest("TC_LINKS_001");
			ExtentTest test2 = extent.createTest("TC_LINKS_002");
			ExtentTest test3 = extent.createTest("TC_LINKS_003");
			
			extent.flush();
			

		}

	

}
