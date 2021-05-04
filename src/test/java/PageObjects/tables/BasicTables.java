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
//        List<String> listOfValuesInTheTableRow = new ArrayList<>();
//        for (int i=0; i<listOfTheCellsInOneRow.size(); i++){
//            listOfValuesInTheTableRow.add(listOfTheCellsInOneRow.get(i).getText());
//        }
//        System.out.println(listOfValuesInTheTableRow);

        /**
         * I want to get the total number of rows in the table.
         * Why? I need it for the loop,
         * just to make sure that I will
         * iterate through all the table
         */
        int numberOfRowsInTheTable = getClickableElements(By.xpath("(//table//tbody)[1]/tr")).size();
        /**
         * Now I have the total number of rows in the table from line 42.
         * What does ot mean? That means I can iterate throw the table by changing the locator for
         * "listOfTheCellsInOneRow"
         */
        /**
         * This is Array List which we will feed with arrayList with values from the specific row.
         */
        List<List<String>> listOfValuesFromAllRows = new ArrayList<List<String>>();
        /**
         * This is arrayList where we will hold all the values that we will read on ONE row.
         */
        List<String> listOfValuesInTheTableRow = new ArrayList<>();

        for (int i =0; i<numberOfRowsInTheTable; i++){
            List<WebElement> listOfTheCellsInOneRow = getClickableElements(By.xpath("(//table//tbody//tr)["+(i+1)+"]//td"));
            for (int j=0; j<listOfTheCellsInOneRow.size(); j++){
                listOfValuesInTheTableRow.add(listOfTheCellsInOneRow.get(j).getText());
            }
            listOfValuesFromAllRows.add(listOfValuesInTheTableRow);
            listOfValuesInTheTableRow = new ArrayList<>();
        }
        System.out.println(listOfValuesFromAllRows);
    }
}
