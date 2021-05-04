package PageObjects.forms.components;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FormComponentsPO extends BasePageObject {
    public void navigateToFormComponents() {
        webDriver.navigate().to(baseURL + "/forms/components");
        waitForPageToBeLoaded();
    }

    public void fillInEmailAddress(String emailAddress) {
        sendTextWithClear(By.cssSelector("[id='exampleInputEmail1']"), emailAddress);
    }

    public void fillInPassword(String password) {
        sendTextWithClear(By.cssSelector("[id='exampleInputPassword1']"), password);
    }

    public void attachFile(String fileName) {
        /**
         * System.getProperty("user.dir") - will return String which will hold the path from root folder:
         * win: C:/
         * MAC OS /usr/local/
         */
        getClickableElement(By.cssSelector("[id='exampleInputFile']"))
                .sendKeys(System.getProperty("user.dir") + "\\" + fileName);
    }

    public void pressSubmit() {
        getClickableElement(By.xpath("//button[normalize-space()='Submit']")).click();
    }

    public String getPopoverMessage() {
        return "";
    }

    public void selectValue() {
    }

    public String readValue() {
        return "";
    }

    /**
     * Example of Selectors
     */
    public void selectSelectorInputLG() {
        Select select = new Select(getClickableElement(By.cssSelector("[class='form-control input-lg']")));
        select.selectByVisibleText(".input-lg");
    }

    public void setCheckBox(String numberOfTheBox, boolean isShouldBeChecked) {
        checkTheCheckBox(isShouldBeChecked, By.xpath("(//*[@class='radio']//./input/..)[" + numberOfTheBox + "]"), "class", "checked");
    }

    public void unCheckTheCheckBox(String numberOfTheBox) {
    }

}
