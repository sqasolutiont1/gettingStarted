package PageObjects.BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePageObject {
    public String baseURL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";
    public static WebDriver webDriver;

    public BasePageObject() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public WebElement getClickableElement(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForAttributeValue(By locator, String attributeName, String value){
        new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions.attributeContains(locator, attributeName, value));
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;
        }
    }
}
