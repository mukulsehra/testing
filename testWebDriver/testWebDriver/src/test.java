import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gnads4u.com/selfservice/step2b.html/14421330");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='apic1']")).click();
		driver.switchTo().frame("sb-player");
		System.out.println(driver.findElement(By.xpath("//*[@id='photoGrid-upload']/div[2]/div/p[1]")).getText());
		driver.findElement(By.xpath("//*[@id='addphoto']")).sendKeys("c:\\screenshot\\abcd.jpg");
		
		driver.findElement(By.xpath("//*[@id='Submit']")).click();
		
		

	}

}
