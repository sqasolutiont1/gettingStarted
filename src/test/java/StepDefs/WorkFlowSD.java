package StepDefs;

import PageObjects.forms.components.FormComponentsPO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class WorkFlowSD {
    FormComponentsPO formComponents = new FormComponentsPO();

    @When("Form Components. Workflow. I fill out form")
    public void formComponentsWorkflowIFillOutForm(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> list = dataTable.asMaps();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Thread.sleep(1000);
            formComponents.fillInEmailAddress(list.get(i).get("email"));
            Thread.sleep(1000);
            formComponents.fillInPassword(list.get(i).get("password"));
            Thread.sleep(1000);
            formComponents.attachFile(list.get(i).get("fileName"));
            formComponents.pressSubmit();
        }
    }

    @After
    public void closeDriver() {
        formComponents.closeDriver();
    }

}
