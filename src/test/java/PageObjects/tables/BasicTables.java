package PageObjects.tables;

import PageObjects.BaseClasses.BasePageObject;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasicTables extends BasePageObject {
    public void navigateToBasicTablesPage() {
        webDriver.navigate().to(baseURL + "/tables/basic");
        waitForPageToBeLoaded();
    }

    public String readTheHeader() {
        List<WebElement> listOfCellsInHeader = getClickableElements(By.xpath("(//table//thead//tr)[1]//th"));
        for (int i=0; i<listOfCellsInHeader.size(); i++){
            System.out.println(listOfCellsInHeader.get(i).getText());
        }
        return null;
    }


}
