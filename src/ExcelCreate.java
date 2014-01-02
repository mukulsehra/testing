import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCreate {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Workbook wb=new XSSFWorkbook();
		 Sheet sheet=wb.createSheet("mukul");
		 
		 Row row = sheet.createRow(0);
		 Cell cell=row.createCell(0);
		 cell.setCellValue("Name");
		 row=sheet.createRow(1);
		 cell=row.createCell(0);
		 cell.setCellValue("mukul");
		 
		 
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\demo1\\Desktop\\mukul.xlsx");
		 wb.write(fos);
		 fos.close();
		 
		System.out.println("File created");
		
	}

}
