import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;


public class testCaptcha {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//http://timesofindia.indiatimes.com/pollopinions/11769367.cms

		SeleniumServer server = new SeleniumServer();
		server.start();
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://timesofindia.indiatimes.com/");
		selenium.start();
		selenium.open("/poll.cms");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		String text = selenium.getText("//*[@id='mathq2']");
		System.out.println(text);
		
		System.out.println(text.substring(0, 1));
		System.out.println(text.substring(4, 5));
		
		int num1 = Integer.parseInt(text.substring(0, 1));
		int num2 = Integer.parseInt(text.substring(4, 5));
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		
		
		//String final_value = String.valueOf(sum);
		
		
		selenium.type("//*[@id='mathuserans2']", Integer.toString(sum));
	}

}
