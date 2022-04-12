package group1_art;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle1 {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://letcode.in/windows");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//	WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.titleContains("windows"));
			
			String winh1=driver.getWindowHandle();
			System.out.println("First Window: "+winh1);
			
			driver.findElement(By.id("multi")).click();
			Set<String> winh2 =driver.getWindowHandles(); 
		
			System.out.println(winh2);
			
			List<String> l1= new ArrayList<String>(winh2);
			
			driver.switchTo().window(l1.get(2));
		driver.close();
		//driver.quit();
		
		driver.switchTo().window(l1.get(0));
		driver.switchTo().window(l1.get(2));
			driver.getCurrentUrl();
			
			System.out.println(driver.getCurrentUrl());
			//WebElement element = driver.findElement(By.name("q"));
	
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}