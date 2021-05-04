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
}
