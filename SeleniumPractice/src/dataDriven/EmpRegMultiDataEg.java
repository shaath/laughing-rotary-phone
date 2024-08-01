package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import commonUtils.BusinessMethods;

public class EmpRegMultiDataEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String prPath = System.getProperty("user.dir");
		System.out.println(prPath);
		
		String xlPath = prPath + "\\src\\testData\\TestData.xlsx";
		String xlout = prPath + "\\src\\results\\TestRes.xlsx";
		String res;
		
		BusinessMethods bm = new BusinessMethods();
		FileInputStream fi = new FileInputStream(xlPath);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		
		int rc = ws.getLastRowNum();
		
		bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		bm.orgLogin("Admin", "Qedge123!@#");
		
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
			
			res = bm.orgEmpReg(f, l, eid);
			
			c4.setCellValue(res);
		}

		FileOutputStream fo = new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		bm.orgLogout();
		bm.orgClose();

	}

}
