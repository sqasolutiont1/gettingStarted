package etrade.tests;

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
        recurringDeposit.selectFr();
    }

    @Test
    public void setWithdrwl() throws InterruptedException {
        takeOutMoney.getMeToTakePotMoney();
        takeOutMoney.selectNeedMoneyInYears();
        takeOutMoney.withdrawMoneyInYears();
        Thread.sleep(5000);
    }
}