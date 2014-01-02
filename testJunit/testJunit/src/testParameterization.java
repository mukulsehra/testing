import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//1st
@RunWith(Parameterized.class)
public class testParameterization {
	
	
	//2nd Step
	String username;
	String password;
	String is_correct;
	
	
	//3rd Step
	public testParameterization(String username, String password, String is_correct){
		
		//4th Step
		this.username = username;
		this.password = password;
		this.is_correct = is_correct;
		
		
	}
	
	//5th Step
	@Parameters
	public static Collection<Object[]> getData(){
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Raman";
		data[0][1] = "sdfsdf";
		data[0][2] = "Y";
		
		data[1][0] = "Nandan";
		data[1][1] = "sdfd";
		data[1][2] = "N";
		
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void testData(){
		
		System.out.println(username+"----------"+password+"--------"+is_correct);
		
		
	}
	

}
