package StepDefs;

import PageObjects.Sliders.Sliders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SlidersSD {
    Sliders sliders = new Sliders();
    @Given("Sliders. I navigate to Sliders.")
    public void slidersINavigateToSliders() {
            sliders.navigateToSlidersPage();
    }

    @When("Sliders. I set {string} to {string}")
    public void slidersISetStyleToAndISetHeightTo(String style, String styleValue) {
        sliders.setSlider(style,styleValue );
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("Sliders. I change the {string} from {string} to {string}")
    public void slidersIChangeTheFromTo(String style, String styleValue1, String styleValueFinal) {
        for (int i=0; i<Integer.parseInt(styleValueFinal); i++){
            sliders.setSlider(style,String.valueOf(Integer.parseInt(styleValue1) + i*2) );
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
