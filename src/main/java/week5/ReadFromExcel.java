package week5;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getExcel();
		//SetExcel();

	}
	
	public static void getExcel() {
	
	
	 try {
         // Specify the path of file
         File src=new File("C:\\Users\\nk16\\Desktop\\SDET_Training\\ExcelWorkShop.xlsx");
        
          // load file
          FileInputStream fis=new FileInputStream(src);
        
          // Load workbook
          XSSFWorkbook wb=new XSSFWorkbook(fis);
          
          // Load sheet- Here we are loading first sheetonly
             //XSSFSheet sh1= wb.getSheetAt(3); // By sheet number
             XSSFSheet sh1= wb.getSheet("Sheet4"); // By sheet name
             
        
         // getRow() specify which row we want to read.
        
         // and getCell() specify which column to read.
         // getStringCellValue() specify that we are reading String data.
        
        
        System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
        
        System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
        
        System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
        
        System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
        
        System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
        
        System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
        
         } catch (Exception e) {
        
          System.out.println(e.getMessage());
        
         }

}
}
