import org.testng.SkipException;
import org.testng.annotations.Test;


public class testCase2 {
	
	@Test
	public void testValidteLink(){
		
		System.out.println("VAlidating the link");
		throw new SkipException("Skipping the tesst case as the runmode is set to NO");
	}

}
