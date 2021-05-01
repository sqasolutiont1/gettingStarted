package etrade.PageObjects.wizard;

import org.openqa.selenium.By;

public class RecurringDeposits extends WizardBasePO{
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/3?neo.skin=mininav";

    public void getMeToRecurringDeposits(){
        navigateTo(url);
    }
    public void insertGoal(String goal){
        getClickableElement(By.xpath("//input[@id='4jxpXtBVs']")).sendKeys(goal);
    }
    public void setfrecuenct(){}

}
