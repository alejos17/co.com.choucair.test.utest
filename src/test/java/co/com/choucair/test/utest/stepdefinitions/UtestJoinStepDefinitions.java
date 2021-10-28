package co.com.choucair.test.utest.stepdefinitions;

import co.com.choucair.test.utest.model.UtestUserData;
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
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage(), EnterRegister.onThePage());
    }


    @When("^he register your personal information in the register form$")
    public void heRegisterYourPersonalInformationInTheRegisterForm(List<UtestUserData> utestUserData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStep1.the(
                utestUserData.get(0).getStrName(),
                utestUserData.get(0).getStrLastName(),
                utestUserData.get(0).getStrEmail(),
                utestUserData.get(0).getStrYearOfBirth(),
                utestUserData.get(0).getStrMonthOfBirth(),
                utestUserData.get(0).getStrDayOfBirth()));
    }

    @Then("^he wants to check the user has created correctly$")
    public void heWantsToCheckTheUserHasCreatedCorrectly() {

    }

}
