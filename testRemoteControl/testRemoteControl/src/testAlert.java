import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;


public class testAlert {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		//http://www.timeanddate.com/worldclock/

		SeleniumServer server = new SeleniumServer();
		server.start();
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.rediff.com/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		selenium.click("//*[@id='signin_info']/a[1]");
		selenium.click("//*[@id='btn_login']");
		
		if(selenium.isAlertPresent()){
			
			System.out.println(selenium.getAlert());
			
			selenium.chooseOkOnNextConfirmation();
		}
		

	}

}
