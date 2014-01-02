import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class testIndiatimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//firefox.exe -profilemanager
		
		ProfilesIni listProfile = new ProfilesIni();
		FirefoxProfile profile = listProfile.getProfile("default");
		FirefoxProfile profile1 = listProfile.getProfile("selenium");
		
		
		
		WebDriver driver = new FirefoxDriver(profile);
		//WebDriver driver1 = new FirefoxDriver(profile1);
		
		
		driver.get("http://timesofindia.indiatimes.com/");
		//driver1.get("http://way2automation.com");
		

		
		
		
		driver.switchTo().frame("mailroifrm12");
		
		driver.findElement(By.xpath("//*[@id='mathuserans2']")).sendKeys("7");
		
	
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		for(int i=0; i<frames.size(); i++){
			
			System.out.println(frames.get(i).getAttribute("id"));
			
		}
		
		System.out.println("total frames are : "+frames.size());
		
		
		

	}

}
