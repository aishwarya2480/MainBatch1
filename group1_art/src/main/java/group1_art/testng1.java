package group1_art;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;


public class testng1 {
	@BeforeClass
	public void launchbrowser() {
		System.out.println("Launch the chrome browser");
		 Assert.assertEquals(true, true);
		 Assert.assertEquals("hi", "hoiiii");
		 String str1 = "hello";
		 Assert.assertTrue(str1.contains("hello"));
		 Assert.assertFalse(false);
		 
		 
	}

}
