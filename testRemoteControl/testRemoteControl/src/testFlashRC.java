import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.FlashSelenium;


public class testFlashRC {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefoxproxy", "http://www.youtube.com");
		selenium.start();
		selenium.open("/watch?v=fjNd9P6IqaI");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		FlashSelenium flashObj = new FlashSelenium(selenium, "movie_player");
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
