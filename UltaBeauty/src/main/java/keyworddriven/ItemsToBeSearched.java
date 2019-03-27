package keyworddriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {
    DataReader dr = new DataReader();
    public String[][] getDataFromExcelFile() throws IOException {
       // String path = System.getProperty("user.dir")+"data/file1.xls";
        String path = System.getProperty("user.dir","UltaBeauty/data/ultaexcelfile.xls");
        String [][] data = dr.fileReader1("UltaBeauty/data/ultaexcelfile.xls",0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"UltaBeauty/data/ultaexcelfile.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
