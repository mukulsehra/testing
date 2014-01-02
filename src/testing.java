import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testing {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.navigate().to("http://www.espncricinfo.com/");
driver.manage().window().maximize();

	int i=0;	

	List<WebElement> elements = driver.findElements(By.className("NavLink"));
	
System.out.println("Number of tabs in the top nav = "+elements.size());

for(;i<elements.size();i++)
{
((JavascriptExecutor)driver).executeScript("mopen('m"+i+"');");
System.out.println(i);
Thread.sleep(2000);

		
}		
		
driver.close();
	}
	
	
}