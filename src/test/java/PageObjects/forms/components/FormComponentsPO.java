package PageObjects.forms.components;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

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
}
