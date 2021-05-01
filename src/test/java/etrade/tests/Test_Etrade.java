package etrade.tests;

import etrade.PageObjects.OurAccountsPO;
import etrade.PageObjects.wizard.GoalPO_First;
import etrade.PageObjects.wizard.PlanToInvestPO;
import org.testng.Assert;
import org.testng.annotations.*;

class Test_Etrade {
    OurAccountsPO accounts = new OurAccountsPO();
    GoalPO_First goal = new GoalPO_First();
    PlanToInvestPO invest = new PlanToInvestPO();
    /**
     * 1. Use our existing Base PO
     * 2. Create Page Object to handle Pages:
     * 2.1 https://us.etrade.com/what-we-offer/our-accounts#tab_0
     * 2.2 https://us.etrade.com/etx/wm/core-portfolios/rtq/1?neo.skin=mininav
     *     * test:
     * 1. Check if you see the label Our Accounts on the first page
     * 2. press on the button
     * 3.
     *
     */

    @BeforeMethod
    public void navigateToThePage(){
        accounts.navigateTo();
    }

    //@Test
    public void checkTheTitle(){
        Assert.assertEquals(accounts.getHeader(),"Our Accounts", "Header label " +
                "is not what we were expecting");
    }

    //@Test
    public void pressOnCorePortfolios(){
        accounts.pressOnCorePortfolios();
    }

    //@Test
    public void getToTheGoalPage(){
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        Assert.assertEquals(goal.getHeader(), "Do you have a goal in mind?");
    }

    //@Test
    public void setTheGoal(){
        accounts.pressOnCorePortfolios();
        accounts.waitForPageToBeLoaded();
        goal.selectGoal("retirement");
        goal.pressContinueBtn();
        goal.waitForPageToBeLoaded();
    }

    @Test
    public void setInvesingAmount(){
        invest.getMeToInvestments();
        invest.setInitailVinestAmount("5000");
        invest.pressContinueBtn();
        invest.waitForPageToBeLoaded();
    }


    @AfterMethod
    public void closeTheDriver(){
        accounts.closeDriver();
    }
}