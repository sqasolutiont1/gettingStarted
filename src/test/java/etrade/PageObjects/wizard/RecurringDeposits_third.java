package etrade.PageObjects.wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RecurringDeposits_third extends WizardBasePO {
    public static String everyWeek = "every week";
    public static String everyMonth = "every month";
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/3?neo.skin=mininav";

    public void getMeToRecurringDeposits() {
        navigateTo(url);
    }

    public void setAmount(String value) {
        getClickableElement(By.cssSelector("input")).sendKeys(value);
    }

    public void selectFr(String frequency) {
        Select select = new Select(getClickableElement(By.cssSelector("select")));
        select.selectByVisibleText(frequency);
    }
}
