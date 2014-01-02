import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class testCase_1 {

@BeforeClass
public static void bforeClass()
{
	System.out.println("driver initialization with firefox driver.....");
}

@Before
public void before()
{
	System.out.println(" In Before .....");
}

@Test
public void testClass()
{
	System.out.println("test case 1.....");
}

@Test
public void testClass2()
{
	System.out.println("test case 2.....");
}

@After
public void after()
{
	System.out.println("after initialization.....");
}

@AfterClass
public static void aftrClass()
{
	System.out.println("quit.....");
}




}
