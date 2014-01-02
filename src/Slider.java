import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Slider {

	/**
	 * @param args
	 * @throws MessagingException 
	 * @throws AddressException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/slider/");
		WebElement element=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(element);
		element=driver.findElement(By.xpath("//*[@id='slider']/a"));
		
		Actions a=new Actions(driver);
		
		
		a.dragAndDropBy(element,300,0).perform();*/
		try{
		monitoringMail mm=new monitoringMail();
		mm.sendMail(TestConfig.server,TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody,TestConfig.attachmentPath, TestConfig.attachmentName);
		throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
		

	}

}
