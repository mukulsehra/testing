import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testCase1 {
	
	public static Xls_Reader excel = null;
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void testIniWebDriver(){
		
		driver = new FirefoxDriver();
		
	}

	@BeforeTest
	public void testCreateDBConnection(){
		
		
		System.out.println("Creating the db connection");
	}
	
	@BeforeMethod
	public void testOpenBrowser(){
		
		System.out.println("Openign the browser");
	}
	
	@Test
	public void testLogin(){
		
		System.out.println("Executing login test");
	}

	
	@AfterMethod
	public void testCloseBrowser(){
		
		System.out.println("Closing the browser");
	}
	
	@AfterTest
	public void testCloseDBConnection(){
		
		
		System.out.println("Closing the db connection");
	}
	
	@AfterSuite
	public void testQuitDriver(){
		
		driver.quit();
	}
	
	
}
