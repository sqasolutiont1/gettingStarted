package PageObjects.tables;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasicTables extends BasePageObject {
    public void navigateToBasicTablesPage() {
        webDriver.navigate().to(baseURL + "/tables/basic");
        waitForPageToBeLoaded();
    }

    public List<String> readTheHeader() {
        List<WebElement> listOfCellsInHeader = getClickableElements(By.xpath("(//table//thead//tr)[1]//th"));
        List<String> listOfHeaderNames = new ArrayList<>();
        for (int i=0; i<listOfCellsInHeader.size(); i++){
            listOfHeaderNames.add(listOfCellsInHeader.get(i).getText());
        }
        return listOfHeaderNames;
    }

    public void readValuesFromTheTable() {
        /***
         * I am reading values from teh cell in ONE row
         */
//        List<WebElement> listOfTheCellsInOneRow = getClickableElements(By.xpath("(//table//tbody//tr)[1]//td"));
//        List<String> listOfValuesInOneRow = new ArrayList<>();
//        for (int i=0; i<listOfTheCellsInOneRow.size(); i++){
//            listOfValuesInOneRow.add(listOfTheCellsInOneRow.get(i).getText());
//        }
//        System.out.println(listOfValuesInOneRow);

        /**
         * What we want to achieve?
         * We want ot read all the values in the table line by line
         * Why do we need it?
         * We need it for the convinience during Assertion. - why? because we will get our test data as the list of values.
         *
         */
        /**
         * So, I want to get the total number of rows so I will know how many rows I have to read.
         * I need this number of rows for the loop. I will use loop to iterate through all these rows.
         */
        /**
         * I want to get the total number of the rows in the table.
         * Why? I need it for the loop,
         * just to make sure that I will
         * iterate through all the table
         */
        int numberOfRowsInTheTable = getClickableElements(By.xpath("(//table//tbody)[1]/tr")).size();
        /**
         * Now I have the total number of rows in the table.
         * What does ot mean? That means I can loop throw the table by changing the locator for
         * "listOfTheCellsInOneRow"
         */
        /**
         * This is Array of Lists which we will feed with List filled in with values from the specific row.
         * This is not a List of the Lists this is List of the Rows right now.
         * And out Row is a List of the values from that row.
         */
        List<List<String>> listOfValuesFromAllRows = new ArrayList<List<String>>();
        /**
         * This is a List where we will hold all the values that we will read from on ONE row.
         */
        List<String> listOfValuesInOneRow = new ArrayList<>();

        /**
         * Outer loop: loops through the table: Row by Row. And it is uses as an exit condition the
         * total number of rows that we have got above. Delivers the List of the Cells in the Specific Row
         */
        for (int i =0; i<numberOfRowsInTheTable; i++){
            /**
             * To loop throw the whole table row by row we have to modify
             * the locator to find the specific row.
             * Why? the locator for the exact row holds the index of the row.
             * and we are going to change it inside of the loop
             * We are getting locator to all the cells in the specific row
             */
            List<WebElement> listOfTheCellsInOneRow = getClickableElements(By.xpath("(//table//tbody//tr)["+(i+1)+"]//td"));
            /**
             * Inner loop: Delivers the access to each
             * Cell in the current row. We are getting
             * the current row from Outer Loop.
             */
            for (int j=0; j<listOfTheCellsInOneRow.size(); j++){
                listOfValuesInOneRow.add(listOfTheCellsInOneRow.get(j).getText());
            }
            /**
             * we are one with the inner loop once we read all the values form the row. Cell by cell
             */
            /**
             * We are adding List to the List of the Lists. (List of teh Rows)
             */
            listOfValuesFromAllRows.add(listOfValuesInOneRow);
            /**
             * Emptying the List of element from one row
             */
            listOfValuesInOneRow = new ArrayList<>();
        }
        System.out.println(listOfValuesFromAllRows);
    }
}
