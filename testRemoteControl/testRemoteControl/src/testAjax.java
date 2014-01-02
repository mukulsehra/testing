import com.thoughtworks.selenium.DefaultSelenium;


public class testAjax {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.co.in/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		selenium.type("//html/body/center/form/table/tbody/tr/td[2]/div/input", "Selenium");
		
		int i=1;
		
		Thread.sleep(1000);
		
		while(selenium.isElementPresent("//html/body/table/tbody/tr/td[2]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td")){
			
			
			System.out.println(selenium.getText("//html/body/table/tbody/tr/td[2]/table/tbody/tr["+i+"]/td/div/table/tbody/tr/td"));
			i++;
		}

	}

}
