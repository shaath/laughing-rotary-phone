package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOpsEg {

	public static void main(String[] args) throws IOException {
		
		String xlPath = "D:\\BugFindersRecordings\\Workspace\\SeleniumPractice\\src\\testData\\TestData.xlsx";
		String xlout = "D:\\BugFindersRecordings\\Workspace\\SeleniumPractice\\src\\results\\Results.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(6);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rc = ws.getLastRowNum();
		
		for(int i = 1; i <= rc; i++)
		{
			XSSFRow r = ws.getRow(i);
			
			XSSFCell c1 = r.getCell(0);
			XSSFCell c2 = r.getCell(1);
			XSSFCell c3 = r.getCell(2);
			XSSFCell c4 = r.createCell(3);
			
			String f = c1.getStringCellValue();
			String l = c2.getStringCellValue();
			String eid = c3.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+eid);
			
			c4.setCellValue("XYZ");
			
		}

		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
