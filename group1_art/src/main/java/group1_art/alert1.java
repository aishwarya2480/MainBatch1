package group1_art;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert1 {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			// WebElement element = driver.findElement(By.name("q"));
			driver.findElement(By.name("proceed")).click();
			Alert alert = driver.switchTo().alert();
			String atext = alert.getText();
			System.out.println("Alert Meaaage: "+atext);
			Thread.sleep(20000);
			alert.accept();
			driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
