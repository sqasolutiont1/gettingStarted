package PageObjects.forms.components;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

import java.io.File;

public class FormComponentsPO extends BasePageObject {
    public void navigateToFormComponents() {
        webDriver.navigate().to(baseURL + "/forms/components");
        waitForPageLoaded();
    }

    public void fillInEmailAddress(String emailAddress){
        getClickableElement(By.cssSelector("[id='exampleInputEmail1']")).sendKeys(emailAddress);
    }

    public void fillInPassword(String password){
        getClickableElement(By.cssSelector("[id='exampleInputPassword1']")).sendKeys(password);
    }

    public void attachFile(String fileName){
        /**
         * System.getProperty("user.dir") - will return String which will hold the path from root folder:
         * win: C:/
         * MAC OS /usr/local/
         */
        getClickableElement(By.cssSelector("[id='exampleInputFile']"))
                .sendKeys(System.getProperty("user.dir") +"\\" +fileName);
    }
    public void pressSubmit(){
        getClickableElement(By.xpath("//button[normalize-space()='Submit']")).click();
    }
    public String getPopoverMessage(){return "";}
    public void selectValue(){}
    public String readValue(){return "";}
}
