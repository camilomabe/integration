package com.camilomabe.steps;

import com.camilomabe.questions.ValidatesUser;
import com.camilomabe.tasks.EntersCredential;
import com.camilomabe.utils.NavigateTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SingInSteps {

    @Before
    public void startsPage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) opens the browser in the home page$")
    public void opensBrowserOnHomePage(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.theWebSideHome());
    }

    @When("^he enters his credentials, (.*) and (.*)$")
    public void entersTheCredentials(String user, String pass) {
        theActorInTheSpotlight().attemptsTo(EntersCredential.forLoginIn(user, pass));
    }

    @Then("^he should see the (.*) in the login home$")
    public void validatesTheTextInThePaymentForm(String user) {
        theActorInTheSpotlight().should(seeThat(ValidatesUser.displayed(), CoreMatchers.equalTo(user)));
    }

}