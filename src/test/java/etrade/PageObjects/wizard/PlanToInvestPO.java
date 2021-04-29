package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class PlanToInvestPO extends WizardBasePO {
    String url = "https://us.etrade.com/etx/wm/core-portfolios/rtq/2?neo.skin=mininav";

    public void getMeToInvestments(){
        navigateTo(url);
    }

    public void setInitailVinestAmount(String amount_of_investment){
        getClickableElement(By.cssSelector("[type=\"text\"]")).sendKeys(amount_of_investment);
    }
}
