import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Create_File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\demo1\\Desktop\\mukul.txt");
		FileWriter fw=new FileWriter(f);

		BufferedWriter w=new BufferedWriter(fw);
		w.write("My name is Mukul Sehra.");
		w.newLine();
		w.write("I am on the second line of this text file..");
		w.close();
		
		System.out.println("File Created...");
	}

}
