package group1_art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class MyTestCases {
WebDriver driver;
	
@FindBy(xpath ="//*[@id=\"top-links\"]/ul/li[2]/a" )WebElement myaccount;
@FindBy(xpath = "//*[@id=\"wishlist-total\"]")WebElement wishlist ;
@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a")WebElement shoppingcart ;
@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[5]/a")WebElement checkout ;
@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a")WebElement telephone ;
@FindBy(xpath="//*[@id=\"input-name\"]")WebElement entername;
@FindBy(xpath="//*[@id=\"input-email\"]")WebElement enteremail;
@FindBy(xpath="//*[@id=\"input-enquiry\"]")WebElement enquiryfield;
@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input") WebElement submit;



	
	public MyTestCases(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickonmyacc1() {
		myaccount.click();
	}
	public void clickwish() {
		wishlist.click();
	}
	public void clickcart() {
		shoppingcart.click();
	}
	public void clickcheckout() {
		checkout.click();
	}
	public void clicktele() {
		telephone.click();
	}
	public void enternamec(String name) {
		entername.sendKeys(name);
	}
	public void enteremailc(String email) {
		enteremail.sendKeys(email);
	}
	public void enterenquiry(String enquiry) {
		enquiryfield.sendKeys(enquiry);
	}
	public void clicksubmit() {
		submit.click();
	}
}
