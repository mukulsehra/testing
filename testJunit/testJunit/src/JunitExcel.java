import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;



//1st Step
@RunWith(Parameterized.class)
public class JunitExcel extends testCase1 {
	
	//2nd Step
	String username;
	String password;
	String is_correct;

	public static Xls_Reader excel = null;

	public JunitExcel(String username, String password, String is_correct){
		
		
		this.username = username;
		this.password = password;
		this.is_correct = is_correct;
		
	}
	

	
	//4th Step
	@Parameters
	 public static Collection<Object[]> getData(){
		 
		 if(excel == null){
				// load the Excel sheet
				excel = new Xls_Reader("c://selenium//data.xlsx");
					
			}
			String sheetName="loginTest";
			int rows = excel.getRowCount(sheetName);  // Get Row Count
			int cols = excel.getColumnCount(sheetName);  // Get Col Count
			Object data[][] = new Object[rows-1][cols]; //-1
			
			for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
				
				for(int colNum=0 ; colNum< cols; colNum++){
					data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
				}
			}
			
			
			
		 
		 return Arrays.asList(data);
		 
	 }
	 
	 @Test
		public void testData(){
			
			driver.get("http://gmail.com");
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Passwd")).sendKeys(password);
			
			
		}
	
	
	
}
