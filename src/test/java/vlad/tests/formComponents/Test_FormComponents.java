package vlad.tests.formComponents;

import org.testng.annotations.Test;
import vlad.PageObjects.Forms.FormComponentsPO;

public class Test_FormComponents {
    /**
     * We instantiated PO. so we can get access to all methods of that object.
     * Why do we need that? this is the only one way ow we can manipulate the browser. And this is
     * the only one way how we can get to the web elements for the page, associated with this Page Object.
     */
    FormComponentsPO formComponents = new FormComponentsPO();

    /**
     * This is how we are telling to out Test Framework: TestNG.
     * that we want to run this method as the test. and we want to get related report about it.
     */
    @Test (description = "This is out first test to fill out email.")
    /**
     * This is out test. This is where we are making all the things that out end user will make with the application,
     */
    public void test_fillOutEmailAddress(){
        /**
         * Before we will start sending text to the text field we have to get there somehow.
         * That means we will need to navigate to teh page where our text field is located.
         */
        formComponents.navigateToFormComponentsPage();
        /**
         * Filling out email address.
         */
        formComponents.fillOutEmailAddress("email");
        /**
         * Closing the browser and destroying the webdriver object. so it won;t pollute the memory.
         */
        formComponents.closeWebDriver();
    }
}
