package etrade.PageObjects.wizard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RecurringDeposits_third extends WizardBasePO{
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/3?neo.skin=mininav";

    public void getMeToRecurringDeposits(){
        navigateTo(url);
    }

    public void selectFr(){
        Select select = new Select(getClickableElement(By.cssSelector("select")));
        select.selectByVisibleText("end of every month");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
