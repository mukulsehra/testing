import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class testXpath {


	public static void main(String[] args) throws IOException {
		
		Properties object = new Properties();
		Properties config = new Properties();
		
		System.out.println(System.getProperty("user.dir"));
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
		object.load(fis);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config.properties");
		config.load(fis);
		
		System.out.println(object.getProperty("username"));
		
		System.out.println(config.getProperty("testsite"));
		
		
	}

}
