package excleFaceBook;

import base.CommonAPI;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadExcle extends CommonAPI {



    public Properties prop ;

    public static Workbook book;
    public static Sheet sheet;

    public final String sheetPath= "/Users/jewal/IntelliJ/WebAutomationGroup3/FaceBook/src/main/java/login.xlsx";

    public static void main(String[] args) {
        ReadExcle ad = new ReadExcle();
        ad.strExcution("login");
    }

    public void strExcution(String sheetName){
        FileInputStream file = null;

        try {
            file = new FileInputStream(sheetPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
          book =  WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(book);



//        String name;
        sheet = book.getSheet(sheetName);
        System.out.println(sheet);
//
//        int k = 0;
//        for (int i =0; i<sheet.getLastRowNum();i++){
//
//            String lovatorColValue = sheet.getRow(i+1).getCell(k+1).toString().trim();
//            if( lovatorColValue.equalsIgnoreCase())
//        }


    }
}
