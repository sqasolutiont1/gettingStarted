package PageObjects.forms.wizard;

public class FormWizardPO {
    public String getHeader(){
        return "header";
    }

    public String getPanelTitle(){
        return "PanelTitle";
    }

    public void pressOnFirstStep(){}
    public void pressOnSecondStep(){}
    public void pressOnLastStep(){}

    public String getWizardViewHeaderFirstStep(){
        return "WizardViewHeader";
    }
    public String getWizardViewHeaderSecondStep(){
        return "WizardViewHeader";
    }
    public String getWizardViewHeaderLastStep(){
        return "WizardViewHeader";
    }
    public void fillInFirstName(String firstName){}
    public void fillInLastName(String lastName){}
    public void pressNextButton(){}

    public void fillInStreetAddress(String streetAddress){}
    public void fillInCity(String city){}
    public void fillInState(String state){}
    public void fillInZIP(String zip){}

    public void pressOnPreviousButton(){}

    public void pressSubmitButton(){}

    public String getFirstName(){
        return "firstname";
    }

    public String getLastName(){
        return "lastname";
    }

    public String getAddress(){return "address";}

}
