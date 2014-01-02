import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class testCase2 {
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	
	@Test
	public void testValidateTitle(){
		
		try{
		String expected = "Google.com";
		String actual = "Yahoo.com";
		System.out.println("Beginning");
		/*
		if(expected.equals(actual)){
			
			System.out.println("Fail");
		}else{
			
			System.out.println("Pass");
		}*/
		
		Assert.assertEquals(expected, actual);
		
		}catch(Throwable t){
			
			System.out.println("Error Occurred");
			t.printStackTrace();
			ec.addError(t);
		}
		System.out.println("Ending");
	}

}
