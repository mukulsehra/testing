import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testCase_1 {

@BeforeSuite
public static void bforeClass()
{
	System.out.println("driver initialization with firefox driver.....");
}

@BeforeMethod
public void before()
{
	System.out.println(" In Before .....");
}

@BeforeTest
public void bt()
{
	System.out.println("in before test");
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

@AfterTest
public void after()
{
	System.out.println("after initialization.....");
}

@AfterMethod
public static void aftrClass()
{
	System.out.println("quit.....");

}

@AfterSuite
public void as()
{
	System.out.println("in as");
}



}
