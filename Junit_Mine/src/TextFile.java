import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TextFile {
	
	
	public static Object[][] getData() throws IOException
	{
		File f=new File("C:\\Users\\demo1\\Desktop\\mukul.txt");
		FileReader fr=new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
		int row=0;
		int column=0;
		ArrayList<Integer> myList=new ArrayList<Integer>();
		String line=null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
			String[] arr=line.split("\t");
		    column=arr.length;
		    for(int i=0;i<column;i++)
		    {
		    	myList.add(Integer.parseInt(arr[i]));
		    	
		    }
		row++;
		
		}
		
				Object[][] data=new Object[row][column];
				
				int var=0;
				for(int i=0;i<data.length;i++)
				{
					for (int j=0;j<data[i].length;j++)
					{
						data[i][j]=myList.get(var);
					var++;
					}
				}
				
				
			reader.close();
			return data;
	}

}
