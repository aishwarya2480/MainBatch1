package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage2 {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a") WebElement myaccount;
	@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a") WebElement loginlink;
	@FindBy(id = "input-email") WebElement username;
	@FindBy(id = "input-password") WebElement password;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input") WebElement loginbutton;

	
	
	public loginpage2(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonmyacc() {
		myaccount.click();
	}
	public void clickloginlink() {
		loginlink.click();
	}
	public void enterusername(String uname) {
		username.click();
	}
	public void enterpassword(String pwd) {
		password.click();
	}
	public void clicklogin() {
		loginbutton.click();
	}
	public void clickmodel() {
		///*[@id="input-sort"]/option[9]
	}
}

