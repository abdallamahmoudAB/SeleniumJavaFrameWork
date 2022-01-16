package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public ExcelUtils(String excelpath, String sheetname) {


	}

	public static void main(String[] args) {

		//getrowcount();
		getcelldatastring(0,0);
		getcelldatanumber(1,1);
	}

	public static void getrowcount() {

		try {
			String pjpath= System.getProperty("user.dir");
			XSSFWorkbook workbook= new XSSFWorkbook(pjpath+"/Excel/data.xlsx");
			XSSFSheet sheet= workbook.getSheet("sheet1"); 
			int rowcount= sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowcount);


		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getcelldatastring(int rownum, int colnum) {
		try {
			String pjpath= System.getProperty("user.dir");
			XSSFWorkbook workbook= new XSSFWorkbook(pjpath+"/Excel/data.xlsx");
			XSSFSheet sheet= workbook.getSheet("sheet1"); 
			String celldata= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(celldata);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

	public static void getcelldatanumber(int rownum, int colnum) {
		try {
			String pjpath= System.getProperty("user.dir");
			XSSFWorkbook workbook= new XSSFWorkbook(pjpath+"/Excel/data.xlsx");
			XSSFSheet sheet= workbook.getSheet("sheet1"); 
			double celldata= sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(celldata);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}


}
