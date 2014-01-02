import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;


public class testCheckboxes {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		SeleniumServer server = new SeleniumServer();
		server.start();
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.tizag.com");
		selenium.start();
		selenium.open("/htmlT/htmlcheckboxes.php");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		/*
		for(int i=1; i<=4; i++){
		
		selenium.check("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]");
		
		}*/
		
		
		int i = 1;
		int count=0;
		
	 
		
		while(selenium.isElementPresent("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]")){
			
			selenium.check("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]");
			i++;
			count++;
			
		}
		
		System.out.println("Total count of checkboxes are : "+count);

	}

}
