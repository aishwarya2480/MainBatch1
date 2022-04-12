package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	By myaccount =By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By loginlink = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By username = By.id("input-email");
	By password = By.id("input-password");
	By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonmyacc() {
		driver.findElement(myaccount).click();
	}
	public void clickloginlink() {
		driver.findElement(loginlink).click();
	}
	public void enterusername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clicklogin() {
		driver.findElement(loginbutton).click();
	}
}

