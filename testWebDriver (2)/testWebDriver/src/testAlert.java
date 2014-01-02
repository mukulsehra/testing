import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testAlert {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='btn_login']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
		
		
		
	}

}
