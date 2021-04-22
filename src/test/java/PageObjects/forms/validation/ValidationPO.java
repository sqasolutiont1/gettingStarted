package PageObjects.forms.validation;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ValidationPO extends BasePageObject {
    public void navigateToValidationPO() {
        webDriver.navigate().to(baseURL + "/forms/validation");
        waitForPageLoaded();
    }

    public void fillInName(String name){
        getClickableElement(By.cssSelector("[name='name']")).sendKeys(name);
    }

    public void fillUserName(String username){
        getClickableElement(By.cssSelector("[name='username']")).sendKeys(username);
    }

    public void fillEmail(String email){
        getClickableElement(By.cssSelector("[name='email']")).sendKeys(email);
    }

    public void pressSubmit(){
        getClickableElement(By.cssSelector("[type='submit']")).click();
    }

}
