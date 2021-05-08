package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestDataManipulation {
    public static String testData = "testData.xlsx";

    public static void createTestData(String testData) throws IOException {
        //Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");

        //Create row object
        XSSFRow row;

        //This data needs to be written (Object[])
        Map< String, Object[] > empinfo =
                new TreeMap< String, Object[] >();
        empinfo.put( "1", new Object[] { "#", "First Name", "Last Name","Username" });
        empinfo.put( "2", new Object[] { "tp01", "Gopal", "Technical Manager" });
        empinfo.put( "3", new Object[] { "tp02", "Manisha", "Proof Reader" });
        empinfo.put( "4", new Object[] { "tp03", "Masthan", "Technical Writer" });
        empinfo.put( "5", new Object[] { "tp04", "Satish", "Technical Writer" });
        empinfo.put( "6", new Object[] { "tp05", "Krishna", "Technical Writer" });

        //Iterate over data and write to sheet
        Set< String > keyid = empinfo.keySet();
        int rowid = 0;

        for (String key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object [] objectArr = empinfo.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }

        //Write the workbook in file system
        FileOutputStream out = new FileOutputStream(new File(testData));
        workbook.write(out);
        out.close();
        System.out.println("Writesheet.xlsx written successfully");
    }

    public static void readFromFile(String testData) throws IOException {
        XSSFRow row;

        FileInputStream fis = new FileInputStream(new File(testData));

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet spreadsheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = spreadsheet.iterator();

        while (rowIterator.hasNext()) {
            row = (XSSFRow) rowIterator.next();
            Iterator < Cell >  cellIterator = row.cellIterator();

            while ( cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                CellType cellType = cell.getCellType();
                if (cellType == CellType.NUMERIC) {
                    System.out.print(cell.getNumericCellValue() + " \t\t ");
                } else if (cellType == CellType.STRING) {
                    System.out.print(
                            cell.getStringCellValue() + " \t\t ");
                }
            }
            System.out.println();
        }
        fis.close();
    }
}
