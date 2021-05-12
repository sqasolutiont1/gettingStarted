package PageObjects.Sliders;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Sliders extends BasePageObject {
    public void navigateToSlidersPage() {
        webDriver.navigate().to(baseURL + "/ui/sliders-progress");
        waitForPageToBeLoaded();
    }

    public void setSlider(String style, String styleValue) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement slider = getClickableElement(By.xpath("(//*[@class=\"slider-selection\"])[7]"));
        WebElement handle = getClickableElement(By.xpath("(//*[@class=\"slider-handle round\"])[7]"));
        js.executeScript("arguments[0]." + style + "='top: " + styleValue + "%';", slider);
        js.executeScript("arguments[0]." + style + "='top: " + styleValue + "%';", handle);
    }

}
