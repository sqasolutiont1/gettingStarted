package PageObjects.forms.validation;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ValidationPO extends BasePageObject {
    public void navigateToValidationPO() {
        webDriver.navigate().to(baseURL + "/forms/validation");
        waitForPageToBeLoaded();
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
        getClickableElement(By.xpath("//button[normalize-space()='Submit']")).click();}

    public void readAlert(){
        Alert alert = webDriver.switchTo().alert();
        //alert.dismiss();
        System.out.println(alert.getText());
        alert.accept();

        //alert.sendKeys("sdfsd");
    }

}
