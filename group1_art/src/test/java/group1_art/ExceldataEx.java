package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceldataEx {
	static WebDriver driver;
	@Test
	public void exceldata() throws FilloException {
		Fillo f = new Fillo();
		Connection con = f.getConnection("C:\\Batch1\\group1_art\\data\\Testdata.xlsx");
		String strquery = "Select * from Sheet1";
		Recordset rs = con.executeQuery(strquery);
		
		while(rs.next()) {
			login(rs.getField("name"),rs.getField("email"));
	}
}
  public void login(String name,String email) {
	  WebDriverManager.chromedriver().setup();
	  try {
		  
		  driver = new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		  
		  loginpage2 login = PageFactory.initElements(driver, loginpage2.class);
		  
		  login.clickonmyacc();
		  login.clickloginlink();
		  login.enterusername(name);
		  login.enterpassword(email);
		  login.clicklogin();	 			
			
	  }catch(Exception e) {
			e.printStackTrace();
		}
  }
  
}
