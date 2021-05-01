package etrade.PageObjects.wizard;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RecurringDeposits_third extends WizardBasePO{
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/3?neo.skin=mininav";

    public void getMeToRecurringDeposits(){
        navigateTo(url);
    }

    public void setgoal(String goal){
        getClickableElement(By.xpath("//input")).sendKeys(goal);
    }
    public void setfrecuency(String frecuency){
        By locator = null;
        if (frecuency.equals("every week")){
            locator = By.xpath("//option[@value='1']");
        } else if (frecuency.equals("every 2 weeks")){
            locator = By.xpath("//option[@value='2']");
        } else if (frecuency.equals("every month")){
            locator = By.xpath("//option[@value='3']");
        } else if (frecuency.equals("end of every month")){
            locator = By.xpath("option[value='4']");
        } else if (frecuency.equals("every 2 months")) {
            locator = By.xpath("option[value='5']");
        }else if (frecuency.equals("every 3 months")) {
            locator = By.xpath("option[value='6']");
        }
        else if (frecuency.equals("every 6 months")) {
            locator = By.xpath("option[value='7']");
        }
        else if (frecuency.equals("every year")) {
            locator = By.xpath("option[value='8']");
        }else {
            Assert.fail("Wrong goal specified");
        }
        getClickableElement(locator).click();
    }
}
