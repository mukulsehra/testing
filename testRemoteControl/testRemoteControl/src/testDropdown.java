import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;


public class testDropdown {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {


		
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.wikipedia.org/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		selenium.select("//*[@id='searchLanguage']", "Dansk");
		
		System.out.println(selenium.getSelectedLabel("//*[@id='searchLanguage']"));
		
		/*
		String values[] = selenium.getSelectOptions("//*[@id='searchLanguage']");
		
		
		for(int i=0; i<values.length; i++){
			
			System.out.println(values[i]);
		}
		
		
		System.out.println("Total values are : "+values.length);
	*/
	}

}
