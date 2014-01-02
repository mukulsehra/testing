import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testTabsandPopups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		System.out.println("--------Generating window ids from first window----------");
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itrate = winids.iterator();
		
		String first_window = itrate.next(); //first window id
		System.out.println(first_window);
		
		driver.findElement(By.xpath("//*[@id='c1322826231823']/div[2]/div[2]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		
		System.out.println("--------Generating window ids from second window---------");
		
		
		winids = driver.getWindowHandles();
		itrate = winids.iterator();
		
		
		System.out.println(itrate.next()); //first window id
		String second_window = itrate.next(); //second window id
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[2]/ul/li[1]/a")).click();
		
		
		System.out.println("--------Generating window ids from third window---------");
		
		
		winids = driver.getWindowHandles();
		itrate = winids.iterator();
		
		
		System.out.println(itrate.next()); //first window id
		System.out.println(itrate.next());
		String third_window = itrate.next();
		System.out.println(third_window);
		
		driver.switchTo().window(third_window);
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/form/table[2]/tbody/tr[11]/td[2]/a/img")).click();
		
	System.out.println("--------Generating window ids from forth window---------");
		
		
		winids = driver.getWindowHandles();
		itrate = winids.iterator();
		
		
		System.out.println(itrate.next()); //first window id
		System.out.println(itrate.next());
		System.out.println(itrate.next());
		String forth_window = itrate.next();
		
		System.out.println(forth_window);
		driver.switchTo().window(forth_window);
		
		
		((JavascriptExecutor) driver).executeScript("ReturnDate(27);");
		
		//driver.findElement(By.xpath("//*[@id='ButtonPanel']/table/tbody/tr[2]/td[1]/a")).click();
		
		
		
		/*
		while(itrate.hasNext()){
			
			System.out.println(itrate.next());
		}*/
		
		
		
		
		
		

	}

}
