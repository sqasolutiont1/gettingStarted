package etrade.tests;

import etrade.PageObjects.wizard.GoalPO_First;
import etrade.PageObjects.wizard.TakeOutMoneyPO_fifth;
import etrade.tests.baseTestComponent.BaseTestComponent;
import org.testng.Assert;
import org.testng.annotations.Test;

class Test_Etrade extends BaseTestComponent {

    public void checkTheTitle() {
        Assert.assertEquals(accounts.getHeader(), "Our Accounts", "Header label " +
                "is not what we were expecting");
    }

    public void pressOnCorePortfolios() {
        accounts.pressOnCorePortfolios();
    }

    public void getToTheGoalPage() {
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        Assert.assertEquals(goal.getHeader(), "Do you have a goal in mind?");
    }

    public void setTheGoal() {
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        goal.selectGoal("retirement");
        goal.pressContinueBtn();
        goal.waitForPageToBeLoaded();
    }

    public void setInvesingAmount() {
        invest.getMeToInvestments();
        invest.setInitailVinestAmount("5000");
        invest.pressContinueBtn();
        invest.waitForPageToBeLoaded();
    }

    public void setFr() {
        recurringDeposit.getMeToRecurringDeposits();
    }

    @Test
    public void setWithdrwl() throws InterruptedException {
        new WorkFlowComponent().firstWFCorePortfolios(GoalPO_First.SaveforRetirement, "23424", "456",
                "656", TakeOutMoneyPO_fifth.over11years, TakeOutMoneyPO_fifth.allAtOnce);
        Thread.sleep(5000);
    }
}