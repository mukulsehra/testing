import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class readConfig {

	
	public String getdata() throws IOException
	
	{
	
		String user=System.getProperty("user.dir");
		Properties conf=new Properties();
		
		FileInputStream fis=new FileInputStream(user+"\\src\\config.properties");
        conf.load(fis);
        
	//System.out.println(conf.getProperty("testsite"));
	
        return conf.getProperty("testsite");
	}
	

}
