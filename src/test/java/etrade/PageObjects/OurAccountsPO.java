package etrade.PageObjects;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class OurAccountsPO extends BasePageObject {
    public String getHeader() {
        return getClickableElement(By.cssSelector("h1")).getText();
    }

    public void pressOnCorePortfolios(){
        getClickableElement(By.cssSelector("[alt='Get started on Core Portfolios']")).click();
    }
}
