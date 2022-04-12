package group1_art;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileloc= "‪‪C:\\Batch1\\group1_art\\data\\Testdata.xlsx" ;
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet = wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
	}

}
