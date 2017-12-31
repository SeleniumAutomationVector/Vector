package script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EnterDataInExcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
	
	String path="./data/Book1.xlsx";
	Workbook wb=new WorkbookFactory().create(new FileInputStream(path));
	//write data into existing row and column
	wb.getSheet("sheet1").getRow(0).getCell(1).setCellValue("Qsp");
	//write data to existing row and new cell
	wb.getSheet("sheet2").getRow(0).createCell(1).setCellValue("Jsp");
	//write data to new row and new cell
	wb.getSheet("sheet2").createRow(1).createCell(0).setCellValue("nsp");
	//save it; same path-> save;diff path->save as
	wb.write(new FileOutputStream("./data/Book2.xlsx"));
}
}
