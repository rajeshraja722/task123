import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcel {
public static void main(String[] args) throws IOException {
File file=new File("C:\\Users\\Rajesh\\eclipse-workspace\\Excel\\Excel\\excel.xlsx");
FileInputStream fileInputStream=new FileInputStream(file);
Workbook book=new XSSFWorkbook(fileInputStream);
Sheet sheet = book.getSheet("Sheet1");
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
String stringCellValue = cell.getStringCellValue();
if(stringCellValue.equals("rajeshraja")) {
	
	cell.setCellValue("raja rajesh kumar");
}
FileOutputStream fileOutputStream=new FileOutputStream(file);
book.write(fileOutputStream);
System.out.println("done......");







}
}
