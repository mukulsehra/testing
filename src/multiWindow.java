import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class multiWindow {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("loginsubmit"));
		
		Set<String> winid=driver.getWindowHandles();
		
		Iterator<String> iterate=winid.iterator();
		
		String firstWindow=iterate.next();
		
		System.out.println(firstWindow);
		
		element.click();
		
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
		winid=driver.getWindowHandles();
		
		iterate=winid.iterator();
		
		System.out.println(iterate.next());
		
		String secondWindow=iterate.next();
		
		System.out.println(secondWindow);
		
		driver.switchTo().window(secondWindow);
		
		driver.close();
		
		driver.switchTo().window(firstWindow);
		
		element=driver.findElement(By.id("user_search"));
		
		element.sendKeys("hdfc Bank");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
