
import java.io.FileWriter;
import java.io.IOException;



public class Append_File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
       
        FileWriter fw=new FileWriter("C:\\Users\\demo1\\Desktop\\mukul.txt",true);
        
        fw.write("\n i am on the third line");
        fw.close();
		System.out.println("Appended");
		
        
        
        
	
	}

}

