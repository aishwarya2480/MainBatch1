package lab_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class labdemo5 {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			
			//verify the title "Your store'
			boolean b = driver.getPageSource().contains("Your Store");
			if(b==true) {
				System.out.println("Expected title is present");
			}
			//click on my acc
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
			
			//select 'registration'
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
			
			//verify 'Register acc' page
			b = driver.getPageSource().contains("Register Account");
			if(b==true) {
				System.out.println("Excpected heading is present");
			
			}
			//click 'continue' button
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
			
			//verify the warning
			b = driver.getPageSource().contains("Warning: You must agree to the Privacy Policy!");
			if(b==true) {
				System.out.println("Expected msgg is present");
			}
			
			//enter 'first name'
			driver.findElement(By.name("firstname")).sendKeys("Aishwaryaqwertyuiopasdfghjklzxcvbnm");
			b=driver.getPageSource().contains("First Name must be between 1 and 32 characters!");
			if(b==true) {
				System.out.println("First name not verified");
			}else {
				System.out.println("First name verified");
			}
			
			//click 'continue' button
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
			
			//verify last name
			driver.findElement(By.name("lastname")).sendKeys("Yadavrtyuqwertyuiopasdfghjklzxcvbnm");
			b=driver.getPageSource().contains("Last Name must be between 1 and 32 characters!");
			if(b==true) {
				System.out.println("Last name not verified");
			}else {
				System.out.println("Last name verified");
			}
			
			//click 'continue' button
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
			
			//enter email
			driver.findElement(By.name("email")).sendKeys("aishyadav2480@gmail.com");
			System.out.println("Email Done");
			
			// enter telephone
			WebElement numField = driver.findElement(By.name("telephone"));
			numField.sendKeys("9381756671");
			String num=numField.getAttribute("value");
			int size = num.length();
			if(size> 3 && size<32)
				System.out.println("You can proceed with telephone");
			else
				System.out.println("The tel should be b/w 3 to 32");
			
			//enter address1
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Address Book")).click();
			driver.findElement(By.name("email")).sendKeys("abcdefg0987654321@gmail.com");
			driver.findElement(By.name("password")).sendKeys("abcdefg");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			driver.findElement(By.linkText("New Address")).click();
			WebElement add1Field = driver.findElement(By.name("address_1"));
			add1Field.sendKeys("Vikarabad");
			String add1=add1Field.getAttribute("value");
				int add1_size = add1.length();
				if(add1_size> 3 && add1_size<128)
					System.out.println("You can proceed with address 1");
				else
					System.out.println("Address should be b/w 3 to 128");
				
				//enter city
				WebElement cityField = driver.findElement(By.name("city"));
				cityField.sendKeys("Vikarabad");
				String city=cityField.getAttribute("value");
					int city_size = city.length();
					if(city_size> 2 && city_size<128)
						System.out.println("You can proceed with city");
					else
						System.out.println("city should be b/w 2 to 128");
					
				//Post code
					WebElement pField = driver.findElement(By.name("postcode"));
					pField.sendKeys("501101");
					String p =pField.getAttribute("value");
						int p_size = p.length();
						if(p_size> 2 && p_size<10)
							System.out.println("You can proceed with Post code");
						else
							System.out.println("Post Code should be b/w 2 to 10");
						
				//select country as India
						driver.findElement(By.xpath("//*[@id=\"input-country\"]")).click();
						driver.findElement(By.xpath("//*[@id=\"input-zone\"]")).click();
						System.out.println("part 3 Done");
						
				//for password
						driver.findElement(By.linkText("My Account")).click();
						driver.findElement(By.linkText("Password")).click();
						WebElement passField = driver.findElement(By.name("password"));
						passField.sendKeys("Hieeeee");
						String pass =passField.getAttribute("value");
							int pass_size = pass.length();
							if(pass_size> 4 && pass_size<20)
								System.out.println("You can proceed with Password");
							else
								System.out.println("Password should be b/w 4 to 20");
							driver.findElement(By.name("confirm")).sendKeys("Hieeeee");
							driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
				//NewsLetter
							driver.get("https://demo.opencart.com/");
							
							driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
							driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
							
							
							//select 'registration'
							driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
							driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
							
							driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
							
							driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
							driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
							b = driver.getPageSource().contains("Register Account");
							if(b==true) {
								System.out.println("Your Account Has Been Created!");
							}
							driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
							driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[6]")).click();
			
				driver.quit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	}

