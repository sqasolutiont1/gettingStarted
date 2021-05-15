package PageObjects.weather;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePageObject {
    @Override
    public void navigateTo(String url) {
        super.navigateTo(url);
    }

    public boolean getLogo() {
        By locator = By.cssSelector("[name=\"twc-logo\"]");
        return getClickableElement(locator).isDisplayed();
    }

    public void clickOnButtons(String buttonName) {
        By locator = By.xpath("(//span[contains(text(),'"+buttonName+"')])[1]");
        getClickableElement(locator).click();
    }

    public void searchForCity(String city) {
        By locator = By.cssSelector("[id='LocationSearch_input']");
        getClickableElement(locator).sendKeys(city);
        waitForElementToBeDisplayed(By.cssSelector("[role='option']"));
        By searchResultsLocator = By.cssSelector("[role='option']");
        List<WebElement> options = getClickableElements(searchResultsLocator);
        if (options.size()>1){
            options.get(0).click();
        } if (options.size()==0){
            System.out.println("ZERO");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
