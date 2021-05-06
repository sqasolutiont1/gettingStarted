package PageObjects.tables;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DataTable extends BasePageObject {
    public void navigateToDataTablePage() {
        webDriver.navigate().to(baseURL + "/tables/data");
        waitForPageToBeLoaded();
    }

    public void searchForSomething(String arg0) {
        getClickableElement(By.cssSelector("[type='search']")).sendKeys(arg0);
    }

    public String getNumberOfRows() {
        return String.valueOf(getClickableElements(By.xpath("//table//tbody/tr")).size());
    }

    public String getDataFromRow() {
        return getClickableElement(By.xpath("//table//tbody/tr")).getText();
    }

    public String getCurrentPagination() {
        return new Select(getClickableElement(By.cssSelector("[name=\"example_length\"]"))).getFirstSelectedOption().getText();
    }
}
