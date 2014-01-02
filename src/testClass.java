import java.io.IOException;
import java.util.List;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testClass extends readConfig {
	static Logger logger = Logger.getLogger(testClass.class);

	ProfilesIni profile=new ProfilesIni();
	FirefoxProfile p1=profile.getProfile("mukul");
	WebDriver driver=new FirefoxDriver(p1);
        
	
	@BeforeSuite		
		public void resourceAllocation() throws IOException
		{
		logger.info("Test message");
		
		readConfig r=new readConfig();
		
		System.out.println(r.getdata());
		
		
		
		}
		
        
        @Test
        public void testCase1() throws InterruptedException
		{
        	
        	
        	driver.navigate().to("http://en.wikipedia.org/wiki/Main_Page");
		
		    System.out.println(driver.getTitle());
	
		    Thread.sleep(5000);
	    
		    driver.findElement(By.id("p-interaction-label")).click();
	    
		    WebElement w=driver.findElement(By.id("p-interaction-label"));
	    
		    Thread.sleep(5000);
	   
	        w.click();
		}
	    
		
        
        @Test
        public void testCase2()
		{
			
	      List<WebElement> divElements=driver.findElements(By.xpath("html/body/div[4]/div[2]/div[3]/div/ul/li"));
	      
	      for(int i=0;i<divElements.size();i++)
	    {
	    	System.out.println("The element at index "+(i+1)+"is  ->  "+divElements.get(i).getText());
	    }
		
		}
		
		@AfterSuite
		public void closeBrowser()
		{
			driver.quit();
		}
		
		
		
		
	}


