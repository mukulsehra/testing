import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 */
	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\demo1\\Desktop\\mukul.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("mukul");
int row=0;
int Column=0;
		for(Row row2:sheet)
		{  int col=0;
			row++;
		
			for(Cell cell0:row2)
			{   col++;
				switch(cell0.getCellType())
				{

				case Cell.CELL_TYPE_STRING: 
					System.out.print(cell0.getStringCellValue()+"\t");
				break;
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print((int)cell0.getNumericCellValue());
					break;
				
				case Cell.CELL_TYPE_BLANK:
					System.out.println("blank cell");
					break;
				
				
				
				}
				
				
				
			}
	
Column=col;
System.out.println();
		}
			
			
				
System.out.println("No. of columns = "+Column);		
System.out.println("No. of rows = "+row);
		
		
		
fis.close();	}

}
