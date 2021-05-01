package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class WizardBasePO extends BasePageObject {

    public void enterAmt(){
        getClickableElement(By.xpath(""))
    }
    public void pressContinueBtn(){
        getClickableElement(By.cssSelector("[type=\"button\"]")).click();
    }
}
