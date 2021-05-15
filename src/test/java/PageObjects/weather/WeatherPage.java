package PageObjects.weather;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class WeatherPage extends BasePageObject {
    public String getCityName() {
        return getClickableElement(By.tagName("h1")).getText();
    }

    public String getCityTemperature() {
        return getClickableElement(By.xpath("//div[1]/div[2]/div[1]/span[1]")).getText();
    }
}
