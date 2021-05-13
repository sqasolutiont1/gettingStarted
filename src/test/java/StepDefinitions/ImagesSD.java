package StepDefinitions;

import authenticgoods.ImagesUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImagesSD {
    ImagesUtil imagesUtil = new ImagesUtil();
    @When("Images. I navigate to:{string}")
    public void imagesINavigateTo(String arg0) {
        imagesUtil.navigateTo(arg0);
    }

    @Then("Images. I check if all the images in place.")
    public void imagesICheckIfAllTheImagesInPlace() {
        imagesUtil.runCheck();
    }
}
