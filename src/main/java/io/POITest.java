package io;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

/**
 * Created by ZSH
 */
public class POITest {
    public static void main(String args[]) throws Exception {
        File file = new File("C:\\Users\\Administrator\\Desktop\\test.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        System.out.println("=========================================");
        System.out.println(Integer.parseInt(null));
//        for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
//            XSSFRow row = sheet.getRow(i);
//            System.out.print(row.getCell(0).getNumericCellValue()+"\t");
//            System.out.print(row.getCell(1).getNumericCellValue()+"\t");
//            System.out.print(row.getCell(2).getNumericCellValue());
//            System.out.println();
//        }
        inputStream.close();
    }

    private static Object getCellValue(XSSFCell cell) {
        if (cell==null){
            return "";
        }
        return cell.getRawValue();
    }
}
