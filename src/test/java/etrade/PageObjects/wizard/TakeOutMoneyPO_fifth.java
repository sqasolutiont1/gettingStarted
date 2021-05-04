package etrade.PageObjects.wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TakeOutMoneyPO_fifth extends WizardBasePO {
    public static String over11years = "Over 11 years or more";
    public static String allAtOnce = "All at once";
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/4?neo.skin=mininav";

    public void getMeToTakePotMoney() {
        navigateTo(url);
    }

    public void selectNeedMoneyInYears(String value) {
        Select select = new Select(getClickableElement(By.xpath("(//select)[1]")));
        select.selectByVisibleText(value);
    }

    public void withdrawMoneyInYears(String value) {
        Select select = new Select(getClickableElement(By.xpath("(//select)[2]")));
        select.selectByVisibleText(value);
    }
}
