package etrade.PageObjects.wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TakeOutMoneyPO_fifth extends WizardBasePO{
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/4?neo.skin=mininav";

    public void getMeToTakePotMoney(){
        navigateTo(url);
    }

    public void selectNeedMoneyInYears(){
        Select select = new Select(getClickableElement(By.xpath("(//select)[1]")));
        select.selectByVisibleText("8-10 years");
    }

    public void withdrawMoneyInYears(){
        Select select = new Select(getClickableElement(By.xpath("(//select)[2]")));
        select.selectByVisibleText("Over 11 years or more");
    }
}
