package etrade.tests;

import etrade.PageObjects.wizard.GoalPO_First;
import etrade.PageObjects.wizard.RecurringDeposits_third;
import etrade.PageObjects.wizard.TakeOutMoneyPO_fifth;
import etrade.tests.baseTestComponent.BaseTestComponent;

public class WorkFlowComponent extends BaseTestComponent {
    public void firstWFCorePortfolios(String goalValue,String inestAmount, String RecurringDeposits, String Amount,
                                      String withdrawMoney, String NeedMoney ){
        accounts.pressOnCorePortfolios();
        goal.selectGoal(goalValue);
        goal.pressContinueBtn();
        invest.setInitailVinestAmount(inestAmount);
        invest.pressContinueBtn();
        recurringDeposit.selectFr(RecurringDeposits);
        recurringDeposit.setAmount(Amount);
        takeOutMoney.withdrawMoneyInYears(withdrawMoney);
        takeOutMoney.selectNeedMoneyInYears(NeedMoney);
    }
}
