package lab_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab_demo6 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			//my acc
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
			//login
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
			driver.findElement(By.id("input-email")).sendKeys("aish7@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("welcome");
			//login button
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			//components
			driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
			//Monitors
			driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
			//show
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/label")).click();
			//25
			driver.findElement(By.id("input-limit")).sendKeys("25");
			//add to cart
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]")).click();
			//apple link
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
			//specification
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
			//verify
			boolean b = driver.getPageSource().contains("The 30-inch Apple Cinema HD Display delivers an amazing 2560 x 1600 pixel resolution.");
			if(b==true) {
				System.out.println("Verified");
			}
			//wishlist
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
			//verify wish list
			 b = driver.getPageSource().contains("Success: You have added Apple Cinema 30\" to your wish list!");
			if(b==true) {
				System.out.println("Success Verified 2");
			}else {
				System.out.println("Not");
			}
			driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("mobile");
			driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]/label")).click();
			driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("3");
			
			
			
			
			
			
			
			
	
			
		}catch(Exception e) {
			e.printStackTrace();
		}

}
}
