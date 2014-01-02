import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testCheckboxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		WebElement block = driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));

		System.out.println(checkboxes.get(1).getAttribute("checked"));
		
		for(int i=0; i<checkboxes.size(); i++){
			
			checkboxes.get(i).click();
		}
		
		System.out.println(checkboxes.get(1).getAttribute("checked"));
		
		System.out.println(checkboxes.size());
		
	}

}
