import com.thoughtworks.selenium.DefaultSelenium;


public class testWebTables {


	public static void main(String[] args) {
	
		DefaultSelenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.timeanddate.com");
		selenium.start();
		selenium.open("/worldclock/");
		selenium.windowMaximize();
		selenium.windowFocus();
		
		
		int i=1;
		int rownum=0;
		
		while(selenium.isElementPresent("//html/body/div[9]/table/tbody/tr["+i+"]/td[1]")){
			
			i++;
			rownum++;
		}
		
		System.out.println("Total number of rows are : "+rownum);
		
		i=1;
		int colnum=0;
		
		while(selenium.isElementPresent("//html/body/div[9]/table/tbody/tr[1]/td["+i+"]")){
			
			i++;
			colnum++;
		}
		
		System.out.println("Total columns are : "+colnum);
		
		
		for(int rows=1; rows<=rownum; rows++){
			for(int cols=1; cols<=colnum; cols++){
				
				System.out.print(selenium.getText("//html/body/div[9]/table/tbody/tr["+rows+"]/td["+cols+"]"));
				
				
			}
			System.out.println();
		}
		
		
		
	}

}
