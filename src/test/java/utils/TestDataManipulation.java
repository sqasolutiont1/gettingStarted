package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class TestDataManipulation {
    public static String testData = "testData.xlsx";

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public void createTestData(String testData) throws IOException {
        //Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a blank sheet
        XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");

        //This data needs to be written (Object[])
        Map<String, Object[]> empinfo =
                new TreeMap<String, Object[]>();
        empinfo.put("1", new Object[]{"#", "First Name", "Last Name", "Username"});
        empinfo.put("2", new Object[]{"1", "Mark", "Otto", "@mdo"});
        empinfo.put("3", new Object[]{"2", "Jacob", "Thornton", "@fat"});
        empinfo.put("4", new Object[]{"3", "Larry", "the Bird", "@twitter"});

        //Iterate over data and write to sheet
        Set<String> keyid = empinfo.keySet();
        int rowid = 0;

        //Create row object
        XSSFRow row;

        for (String key : keyid) {
            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = empinfo.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }

        //Write the workbook in file system
        FileOutputStream out = new FileOutputStream(new File(testData));
        workbook.write(out);
        out.close();
        System.out.println("written successfully");
    }

    public void readFromFile(String testData) throws IOException {
        XSSFRow row;

        FileInputStream fis = new FileInputStream(new File(testData));

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet spreadsheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = spreadsheet.iterator();

        List<Map<String, String>> mapList = new ArrayList<>();
        int lineNumber = 1;
        while (rowIterator.hasNext()) {
            row = (XSSFRow) rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            Map<String, String> map = new LinkedHashMap<>();
            if (lineNumber == 1) {
                lineNumber++;
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    map.put(cell.getStringCellValue(), "");
                    System.out.println(map);
                    mapList.add(map);
                    map = new LinkedHashMap<>();
                }
                System.out.println();
            } else {
                Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
                while (itr.hasNext()) {
                    Map.Entry<String, String> entry = itr.next();
                    System.out.println("Key = " + entry.getKey() +
                            ", Value = " + entry.getValue());
                    map.put(map.get(entry.getKey()), itr.next().getValue());
                }

//                while ( cellIterator.hasNext()) {
//                    Cell cell = cellIterator.next();
//                    map.put(map.get(cellIterator.next()),cell.getStringCellValue());
//                    System.out.println(map);
//                    mapList.add(map);
//                }
            }
        }
        System.out.println(mapList);
        fis.close();
    }
}
