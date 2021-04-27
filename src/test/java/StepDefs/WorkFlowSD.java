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
    public void formComponentsWorkflowIFillOutForm(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps();
        System.out.println(list);
        for (int i = 0; i<list.size();i++){
            formComponents.fillInEmailAddress(list.get(i).get("email"));
        }
    }

    @After
    public void closeDriver() {
        formComponents.closeDriver();
    }

}
