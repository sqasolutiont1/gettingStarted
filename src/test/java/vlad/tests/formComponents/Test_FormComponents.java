package vlad.tests.formComponents;

import org.testng.annotations.Test;
import vlad.PageObjects.Forms.FormComponentsPO;

public class Test_FormComponents {
    FormComponentsPO formComponents = new FormComponentsPO();
    @Test
    public void fillOutEmailAddress(){
        formComponents.navigateToFormComponentsPage();
        formComponents.fillOutEmailAddress("email");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formComponents.closeWebDriver();
    }
}
