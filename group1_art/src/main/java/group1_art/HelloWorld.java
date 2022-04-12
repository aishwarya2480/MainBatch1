package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("What is selenium");
			element.submit();
			System.out.println("The page title is: "+driver.getTitle());
			driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
