package etrade.PageObjects;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class OurAccountsPO extends BasePageObject {
    String URL = "https://us.etrade.com/what-we-offer/our-accounts#tab_0";

    public void navigateTo() {
        webDriver.navigate().to(URL);
        waitForPageToBeLoaded();
    }

    public String getHeader() {
        return getClickableElement(By.cssSelector("h1")).getText();
    }
}
