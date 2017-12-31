package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcel2 {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
	
	String path="./data/Book1.xlsx";
	Workbook wb=new WorkbookFactory().create(new FileInputStream(path));
	
	for(int i=0;i<=2;i++)
	{
		String v=wb.getSheet("sheet1").getRow(0).getCell(i).toString();
		System.out.println(v);
	}
	
}
}
