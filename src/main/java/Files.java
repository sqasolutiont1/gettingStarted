import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

public class Files {
    private static final String MAIN_PATH = "src/main/resources/";

    public static void printTheThing(){
        System.out.println("Print");
    }
    public void printTheWholeThing(){
        System.out.println("Print");
    }
    public static void main(String[] args) throws IOException {

//         file1: "Hello World!"
//         file2: "Hello World!!!"
//        File file1 = FileUtils.getFile(MAIN_PATH + "cmpFile1.txt");
//        File file2 = FileUtils.getFile(MAIN_PATH + "cmpFile2.txt");
//        System.out.println("Are cmpFile1 and cmpFile2 equal: " +
//                FileUtils.contentEquals(file1, file2));


//         We can copy a whole path somewhere
//         and check if the operation was successful.
//        File file1 =  FileUtils.getFile(MAIN_PATH);
//        File file2 =  FileUtils.getFile(MAIN_PATH + "copiedPath");
//        FileUtils.copyDirectory(file1, file2);
//
//        System.out.println("Does the copiedPath exist: " + file2.exists());

//
        // Copy a directory by filtering out all the txt files.
        // In the directory right now: cmpFile1.txt, cmpFile2.txt, zipFile.zip
//        FileUtils.copyDirectory(
//                FileUtils.getFile(MAIN_PATH),
//                FileUtils.getFile(MAIN_PATH + "copiedFilterPath"),
//                new SuffixFileFilter(".zip"));
//
//        for (File f : FileUtils.getFile(MAIN_PATH + "copiedFilterPath").listFiles()) {
//            System.out.println("Contents of copiedFilterPath: " + f.getName());
//        }
//
//
//        // Copy a file
//        File copy = FileUtils.getFile(MAIN_PATH + "copyOfFile1.txt");
//        FileUtils.copyFile(file1, copy);
//        System.out.println("Are cmpFile1 and copyOfFile1 equal: " +
//                FileUtils.contentEquals(file1, copy));
//
//
//        // Right now there are these files in the MAIN_PATH.
//        for (File f : FileUtils.getFile(MAIN_PATH).listFiles()) {
//            System.out.println("Contents of MAIN_PATH: " + f.getName());
//       }
//        // Let's delete a directory and see the results.
//        FileUtils.deleteDirectory(FileUtils.getFile(MAIN_PATH + "copiedFilterPath\\"));
//        for (File f : FileUtils.getFile(MAIN_PATH).listFiles()) {
//            System.out.println("Contents of MAIN_PATH after deletion: " + f.getName());
//        }

//
//        // Directories
//        System.out.println("Temp Dir: " +
//                FileUtils.getTempDirectory().getAbsolutePath());
//        System.out.println("User Dir: " +
//                FileUtils.getUserDirectory().getAbsolutePath());


        // Line Iterator
//        File file1 = FileUtils.getFile(MAIN_PATH + "cmpFile1.txt");
//        LineIterator iter = FileUtils.lineIterator(file1);
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//
        // Directory size
//        System.out.println("Size of dir: " +
//                FileUtils.sizeOfDirectory(FileUtils.getFile(MAIN_PATH)) +
//                " bytes.");
//
//
        // Ways of writing lines to a file.
        File fileToWrite1 = FileUtils.getFile(MAIN_PATH + "fileToWrite1.txt");
        File fileToWrite2 = FileUtils.getFile(MAIN_PATH + "fileToWrite2.txt");

        Collection lines = new ArrayList<>();
        lines.add("Written with FileUtils!");
        lines.add("For Java Code Geeks.");

        FileUtils.write(fileToWrite1, "Written with FileUtils!", Charset.defaultCharset());
        FileUtils.writeLines(fileToWrite2, lines);

        LineIterator iter = FileUtils.lineIterator(fileToWrite1);
        while (iter.hasNext()) {
            System.out.println("fileToWrite1 lines: " + iter.next());
        }
        iter = FileUtils.lineIterator(fileToWrite2);
        while (iter.hasNext()) {
            System.out.println("fileToWrite2 lines: " + iter.next());
        }
    }
}
