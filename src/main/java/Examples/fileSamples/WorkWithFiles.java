package Examples.fileSamples;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorkWithFiles {
    /**
     * Apache POI contains classes and methods to work on all OLE2 Compound documents of MS Office.
     * The list of components of this API is given below.
     *
     * POIFS (Poor Obfuscation Implementation File System) − This component is the basic factor of all other POI elements.
     * It is used to read different files explicitly.
     *
     * HSSF (Horrible Spreadsheet Format) − It is used to read and write xls format of MS-Excel files.
     *
     * XSSF (XML Spreadsheet Format) − It is used for xlsx file format of MS-Excel.
     *
     * HPSF (Horrible Property Set Format) − It is used to extract property sets of the MS-Office files.
     *
     * HWPF (Horrible Word Processor Format) − It is used to read and write doc extension files of MS-Word.
     *
     * XWPF (XML Word Processor Format) − It is used to read and write docx extension files of MS-Word.
     *
     * HSLF (Horrible Slide Layout Format) − It is used for read, create, and edit PowerPoint presentations.
     *
     * HDGF (Horrible DiaGram Format) − It contains classes and methods for MS-Visio binary files.
     *
     * HPBF (Horrible PuBlisher Format) − It is used to read and write MS-Publisher files.
     */
        public static void main(String[] args)throws Exception {
            readFromFile();
        }

        public static void readFromFile() throws IOException {
            XSSFRow row;

            FileInputStream fis = new FileInputStream(new File("WriteSheet.xlsx"));

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

        public static void createTestData() throws IOException {
            //Create blank workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            //Create a blank sheet
            XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");

            //Create row object
            XSSFRow row;

            //This data needs to be written (Object[])
            Map< String, Object[] > empinfo =
                    new TreeMap< String, Object[] >();
            empinfo.put( "1", new Object[] { "EMP ID", "EMP NAME", "DESIGNATION" });
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
            FileOutputStream out = new FileOutputStream(new File("Writesheet.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Writesheet.xlsx written successfully");
        }


        private static void openFile() throws IOException {
            File file = new File("openworkbook.xlsx");
            FileInputStream fIP = null;
            fIP = new FileInputStream(file);
            //Get the workbook instance for XLSX file
            XSSFWorkbook workbook = new XSSFWorkbook(fIP);
            XSSFSheet spreadsheet = workbook.createSheet("Sheet Name");
            if(file.isFile() && file.exists()) {
                System.out.println("openworkbook.xlsx file open successfully.");
            } else {
                System.out.println("Error to open openworkbook.xlsx file.");
            }
        }

        private static void createFile() throws IOException {
            //Create Blank workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            //Create file system using specific name
            FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));
            //write operation workbook using file out object
            workbook.write(out);
            out.close();
            System.out.println("createworkbook.xlsx written successfully");
        }
    }

