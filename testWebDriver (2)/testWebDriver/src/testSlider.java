import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class testSlider {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		WebDriver driver = null;
		Properties object = new Properties();
		Properties config = new Properties();
		
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
		object.load(fis);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config.properties");
		config.load(fis);
		
		
		if(config.getProperty("browser").equals("firefox")){
			
			driver = new FirefoxDriver();
			
		}else if(config.getProperty("browser").equals("ie")){

			System.setProperty("webdriver.ie.driver", "c:\\softwares\\IEDriverServer.exe");
	
			driver = new InternetExplorerDriver();
	
		}else if(config.getProperty("browser").equals("chrome")){
			

			System.setProperty("webdriver.chrome.driver", "c:\\softwares\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		}
		
		
		
		driver.get(config.getProperty("testsite"));
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		WebElement slider = driver.findElement(By.xpath(object.getProperty("slider")));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 400, 0).perform();
		
	}

}
