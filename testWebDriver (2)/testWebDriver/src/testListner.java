import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;


public class testListner {


	public static void main(String[] args) throws InterruptedException {


		WebDriver webdriver = new FirefoxDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		weblistner listner = new weblistner();
		driver.register(listner);
		
		
		driver.get("http://google.com");
		
		EventFiringMouse mouse = new EventFiringMouse(driver, listner);
		Locatable hoverItem = (Locatable) driver.findElement(By.xpath("//*[@id='gb_23']"));
		Coordinates cord = hoverItem.getCoordinates();
		mouse.mouseMove(cord);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='fll']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='testimonial']/div[1]/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sdfdfd");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("sdfdfd");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		driver.navigate().back();
		
		
		
	}

}
