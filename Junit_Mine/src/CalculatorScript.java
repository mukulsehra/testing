import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorScript {

int value1,value2;
Calculator c=new Calculator();
public CalculatorScript(int value1,int value2)
{
	this.value1=value1;
	this.value2=value2;
}

@Before
public void setInput()
{
	c.setValue(value1,value2);
}

@Test
public void printing()
{
	System.out.println("Value1 =  "+value1 +" and Value2 = "+value2);
	c.getSum();
	
}

@Parameters
public static Collection<Object[]> getData() throws IOException
{
	Object[][] data=TextFile.getData();
	return Arrays.asList(data);
}




}