package etrade.tests;

import etrade.PageObjects.OurAccountsPO;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

class Test_Etrade {
    OurAccountsPO accounts = new OurAccountsPO();
    /**
     * 1. Use our existing Base PO
     * 2. Create Page Object to handle Pages:
     * 2.1 https://us.etrade.com/what-we-offer/our-accounts#tab_0
     * 2.2 https://us.etrade.com/etx/wm/core-portfolios/rtq/1?neo.skin=mininav
     *
     * test:
     * 1. Check if you see the label Our Accounts on the first page
     * 2. press on the button
     * 3.
     *
     */

    @BeforeSuite
    public void navigateToThePage(){
        accounts.navigateTo();
    }

    @Test
    public void checkTheTitle(){
        Assert.assertEquals(accounts.getHeader(),"Our Accounts");
    }

    @AfterSuite
    public void closeTheDriver(){
        accounts.closeDriver();
    }
}