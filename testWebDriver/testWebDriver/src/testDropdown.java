
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testDropdown {


	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org/");
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Dansk");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		for(int i=0; i<values.size(); i++){
			
			System.out.println(values.get(i).getAttribute("lang"));
			
		}
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[18]"));
		
	List<WebElement> links = block.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++){
			
			System.out.println(links.get(i).getText());
			
		}
		
		System.out.println(links.size());
		

	}

}
