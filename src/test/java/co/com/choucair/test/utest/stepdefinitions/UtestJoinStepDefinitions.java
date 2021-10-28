package co.com.choucair.test.utest.stepdefinitions;

import co.com.choucair.test.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestJoinStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than alejandro wants to join in the Utest Website with the personal data$")
    public void thanAlejandroWantsToJoinInTheUtestWebsiteWithThePersonalData() {
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage());
    }


    @When("^he register your personal information in the register form$")
    public void heRegisterYourPersonalInformationInTheRegisterForm() {

    }

    @Then("^he wants to check the user has created correctly$")
    public void heWantsToCheckTheUserHasCreatedCorrectly() {

    }

}
