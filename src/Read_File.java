import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Read_File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\demo1\\Desktop\\mukul.txt");
		FileReader fr=new FileReader(f);
        BufferedReader read=new BufferedReader(fr);
        String line=null;
        while((line=read.readLine())!=null)
        {
        	System.out.println(line);
        }
		read.close();
		
	}

}
