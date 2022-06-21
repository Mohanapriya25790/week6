package week5;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static String[][] read() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/dats.xlsx");//
		XSSFSheet ws=wb.getSheet("Sheet1");
		//get row count
		int rowNum = ws.getLastRowNum();
		System.out.println(rowNum);
		//get cell count
		int cellCount= ws.getRow(0).getLastCellNum();
		String[][]data=new String[rowNum][cellCount];
		for(int i=1;i<=rowNum;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}	
		wb.close();
		
		return data;
	}

}
