package etrade.tests;

import etrade.tests.baseTestComponent.BaseTestComponent;
import org.testng.Assert;
import org.testng.annotations.Test;

class Test_Etrade extends BaseTestComponent {

    @Test
    public void checkTheTitle() {
        Assert.assertEquals(accounts.getHeader(), "Our Accounts", "Header label " +
                "is not what we were expecting");
    }

    @Test
    public void pressOnCorePortfolios() {
        accounts.pressOnCorePortfolios();
    }

    @Test
    public void getToTheGoalPage() {
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        Assert.assertEquals(goal.getHeader(), "Do you have a goal in mind?");
    }

    @Test
    public void setTheGoal() {
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        goal.selectGoal("retirement");
        goal.pressContinueBtn();
        goal.waitForPageToBeLoaded();
    }

    @Test
    public void setInvesingAmount() {
        invest.getMeToInvestments();
        invest.setInitailVinestAmount("5000");
        invest.pressContinueBtn();
        invest.waitForPageToBeLoaded();
    }
}