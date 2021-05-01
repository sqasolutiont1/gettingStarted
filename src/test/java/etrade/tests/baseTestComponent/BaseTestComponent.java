package etrade.tests.baseTestComponent;

import etrade.PageObjects.OurAccountsPO;
import etrade.PageObjects.wizard.GoalPO_First;
import etrade.PageObjects.wizard.PlanToInvestPO_second;
import etrade.PageObjects.wizard.RecurringDeposits_third;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestComponent {
    public OurAccountsPO accounts = new OurAccountsPO();
    public GoalPO_First goal = new GoalPO_First();
    public PlanToInvestPO_second invest = new PlanToInvestPO_second();
    public RecurringDeposits_third recurringDeposit = new RecurringDeposits_third();
    @BeforeMethod
    public void navigateToThePage(){
        accounts.navigateTo();
    }

    @AfterMethod
    public void closeTheDriver(){
        accounts.closeDriver();
    }
}
