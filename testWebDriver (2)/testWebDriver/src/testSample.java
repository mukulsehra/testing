import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testSample {

	
	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("https://www.autodata-online.net/online/login/autodatalogon.aspx");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		/*
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UsernameTextBox"));
		element.sendKeys("raman@gmail.com");
		
		element = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_PasswordTextBox']"));
		element.sendKeys("sdfdff");
		
		element = driver.findElement(By.name("ctl00$ContentPlaceHolder1$SubmitBtn"));
		element.click();
		
	//	Thread.sleep(3000);
		
		element = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_MessageLabel']"));
		System.out.println(element.getText());
		*/
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_UsernameTextBox")).sendKeys("raman@gmail.com");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_PasswordTextBox']")).sendKeys("sfgdfsd");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$SubmitBtn")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_MessageLabel']")).getText());
		
		//driver.close(); //current browser
		//driver.quit(); //current browser + all related browser
		

	}

}
