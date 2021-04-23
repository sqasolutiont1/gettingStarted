package PageObjects.forms.components;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormComponentsPO extends BasePageObject {
    public void navigateToFormComponents() {
        webDriver.navigate().to(baseURL + "/forms/components");
        waitForPageLoaded();
    }

    public void fillInEmailAddress(String emailAddress){
        getClickableElement(By.cssSelector("[id='exampleInputEmail1']")).sendKeys(emailAddress);
    }
    public void fillInPassword(){}
    public void attachFile(){}
    public void pressSubmit(){}
    public String getPopoverMessage(){return "";}
    public void selectValue(){}
    public String readValue(){return "";}

    /**
     * Example of Selectors
     */
    public void selectSelectorInputLG() {
        Select select = new Select(getClickableElement(By.cssSelector("[class='form-control input-lg']")));
        select.selectByVisibleText(".input-lg");
    }

    public void setCheckBox(String numberOfTheBox, boolean isShouldBeChecked) {
        checkTheCheckBox(isShouldBeChecked, By.xpath("(//*[@class='radio']//./input/..)["+numberOfTheBox+"]"),"class", "checked");
    }

    public void unCheckTheCheckBox(String numberOfTheBox) {
    }
}
