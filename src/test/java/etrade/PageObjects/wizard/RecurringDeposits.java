package etrade.PageObjects.wizard;

public class RecurringDeposits extends WizardBasePO{
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/3?neo.skin=mininav";

    public void getMeToRecurringDeposits(){
        navigateTo(url);
    }



}
