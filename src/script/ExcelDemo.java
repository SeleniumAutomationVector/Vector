package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
	
	String path="./data/Book1.xlsx";
	Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	String v1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(v1);
	String v2=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(v2);
	
	
}
	
}
