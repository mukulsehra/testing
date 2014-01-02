import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class testMouseOver {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.thejewellerychannel.tv/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='topnav']/li[2]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.xpath("//*[@id='topnav']/li[2]/div/ul[1]/li[3]/a")).click();
		
	}

}
