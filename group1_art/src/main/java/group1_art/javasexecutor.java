package group1_art;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javasexecutor {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("alert('Hello World!!');");
			
			//driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
