import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testCase1 {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void testInitWebDriver(){
		
		driver = new FirefoxDriver();
	}
	
	@Before
	public void testOpenBrowser(){
		
		
		System.out.println("Opening the browser");
	}

	
	@Test
	public void testLogin(){
				
		System.out.println("Executing login test");
		
	}
	
	@Ignore
	@Test
	public void testUserregisteration(){
		
		System.out.println("Executing user registeration test");
		
	}
	
	@After
	public void testCloseBrowser(){
		
		
		System.out.println("Closing the browser");
	}
	
	@AfterClass
	public static void testQuitDriver(){
		
		driver.quit();
	}
	
}
