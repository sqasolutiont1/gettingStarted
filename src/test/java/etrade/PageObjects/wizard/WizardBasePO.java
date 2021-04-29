package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class WizardBasePO extends BasePageObject {
    public void pressContinueBtn(){
        getClickableElement(By.cssSelector("[type=\"button\"]")).click();
    }
}
