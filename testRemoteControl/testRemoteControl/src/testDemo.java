import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;


public class testDemo {


	public static void main(String[] args) throws Exception {


		//System.out.println("Hello World!!!");
		SeleniumServer server = new SeleniumServer();
		server.start();
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://gmail.com/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		//System.out.println(selenium.getTitle());
		monitoringMail mail = new monitoringMail();
		
	
		try{
		String title = selenium.getTitle();
		System.out.println(title);
		System.out.println(selenium.isElementPresent("//*[@id='Email']"));
		selenium.type("//*[@id='Emil']", "raman@gmail.com");
		selenium.type("//*[@id='Passwd']", "sdfdf");
		selenium.click("//*[@id='signIn']");
		selenium.waitForPageToLoad("50000");
		System.out.println(selenium.getText("//*[@id='errormsg_0_Passwd']"));
		}catch(Exception e){
		//selenium.captureScreenshot("c:\\screenshot\\abcd.jpg");
		selenium.captureEntirePageScreenshot("c:\\screenshot\\abcd.jpg", "");
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, e.getMessage(), TestConfig.attachmentPath, TestConfig.attachmentName);
		}
		selenium.close(); // current window
		selenium.stop(); //kill the session
		server.stop();

	}

}
