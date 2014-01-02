import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class testWebDriverFlash {


	public static void main(String[] args) throws InterruptedException {

		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(profile);

		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com/watch?v=fjNd9P6IqaI");
		
		FlashWebDriver flashObj = new FlashWebDriver(driver, "movie_player");
		
		Thread.sleep(10000);
		flashObj.call("pauseVideo");
		Thread.sleep(4000);
		flashObj.call("playVideo");
		Thread.sleep(4000);
		flashObj.call("mute");
		Thread.sleep(4000);
		flashObj.call("unMute");
		
	}

}
