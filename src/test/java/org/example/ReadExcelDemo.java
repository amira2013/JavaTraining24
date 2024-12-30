package org.example;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\target\\Resister (2).xlsx";
        File file=new File(path);
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet = wb.getSheet("Sheet1");
       Row row =sheet.getRow(1);
       Cell cell =row.getCell(0);
       String cellData=cell.getStringCellValue();
       Row r1=sheet.getRow(1);
       Cell c1=r1.getCell(1);
       String Celldata1=c1.getStringCellValue();
        System.out.println("The excel value 2 is  :"+Celldata1);
        System.out.println("The exel value 1 is : ="+cellData);


    }
}
