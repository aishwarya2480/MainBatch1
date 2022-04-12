package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider1 {
	static WebDriver driver;
	
	@DataProvider(name="login1")
	public String[][] getdata(){
		String[][] data = new String[2][2];
		data[0][0] = "abcdef0987654321@gmail.com";
		data[0][1] = "abcdef";
		
		data[1][0] = "abcdefg0987654321@gmail.com";
		data[1][1] = "abcdefg";
		return data;
		
		
	}
	@DataProvider(name="reg1")
	public String[][] getdata1(){
		String[][] data1 = new String[5][4];
		data1[0][0] = "Aishuuuu";
		data1[1][0] = "Yadav";
		data1[2][0] = "abcdefg0987654321@gmail.com";
		data1[3][0] = "9876543210";
		data1[4][0] = "abcdefg";
		
		data1[0][0] = "Aishwarya";
		data1[1][0] = "Yadav";
		data1[2][0] = "abcdef0987654321@gmail.com";
		data1[3][0] = "9876543211";
		data1[4][0] = "abcdef";
		return data1;
		
		
	}
	
  @Test(dataProvider="login1")
  public void login(String email,String password) {
	  WebDriverManager.chromedriver().setup();
	  try {
		  
		  driver = new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		  
		  loginpage login = new loginpage(driver);
		  
		  login.clickonmyacc();
		  login.clickloginlink();
		  login.enterusername(email);
		  login.enterpassword(password);
		  login.clicklogin();
		  
		  
		  
			//driver = new ChromeDriver();
//			driver.get("https://demo.opencart.com/");
//			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
//			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
//			driver.findElement(By.id("input-email")).sendKeys(email);
//			driver.findElement(By.id("input-password")).sendKeys(password);
//			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//			
//			driver.get("https://demo.opencart.com/");
//			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
//			
			
	  }catch(Exception e) {
			e.printStackTrace();
		}
  }
  
}
