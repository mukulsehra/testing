import com.thoughtworks.selenium.DefaultSelenium;


public class testTabsandPopups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.hdfcbank.com/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		System.out.println("----------Generating window names from first window-----------");
		String winnames[] = selenium.getAllWindowNames();
		
		for(int i=0; i<winnames.length; i++){
			
			System.out.println(winnames[i]);
		}
		
		selenium.click("//*[@id='loginsubmit']");
		
		System.out.println("----------Generating window names from second window-----------");
		
	
		
		winnames = selenium.getAllWindowNames();
		
		for(int i=0; i<winnames.length; i++){
			
			System.out.println(winnames[i]);
		}
		
		selenium.selectWindow(winnames[1]);
		selenium.waitForPopUp(winnames[1], "50000");
		
		selenium.click("//*[@id='wrapper']/div[2]/div[2]/ul/li[1]/a");
		
		System.out.println("----------Generating window names from second window-----------");
		
	
		
		winnames = selenium.getAllWindowNames();
		
		for(int i=0; i<winnames.length; i++){
			
			System.out.println(winnames[i]);
		}
		
		selenium.selectWindow(winnames[2]);
		selenium.waitForPopUp(winnames[2], "50000");
		
		
		selenium.type("//html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/form/table[2]/tbody/tr[5]/td[2]/input", "Raman");
		
		selenium.close();
		selenium.selectWindow(winnames[1]);
		selenium.close();

	}

}
