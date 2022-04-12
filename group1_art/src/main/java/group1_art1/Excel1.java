package group1_art1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		
		String fileloc = "C:\\batch_1\\group1_art\\src\\main\\java\\data\\TestData.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileloc);
		XSSFSheet sheet = wbook.getSheetAt(0);
		for (int i = 1; i <= 2; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				XSSFCell cell = row.getCell(j);

				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
		}
		//wbook.close();
	}
}
