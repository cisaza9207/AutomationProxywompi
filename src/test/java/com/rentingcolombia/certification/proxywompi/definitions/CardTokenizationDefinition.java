package com.rentingcolombia.certification.proxywompi.definitions;

import com.rentingcolombia.certification.proxywompi.models.ExtractInformationCard;
import com.rentingcolombia.certification.proxywompi.models.TokenizationRequest;
import com.rentingcolombia.certification.proxywompi.tasks.IdCard;
import com.rentingcolombia.certification.proxywompi.tasks.PostTokenizeCard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

public class CardTokenizationDefinition {


    @Given("the project gets the publickey of Rentingcolombia for Wompi")
    public void theProjectGetsThePublickeyOfRentingcolombiaForWompi() {

    }

    @When("he called wompi's API whit the information")
    public void heCalledWompiSAPIWhitTheInformation(List<TokenizationRequest> dataCard) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("project").whoCan(CallAnApi.at("https://sandbox.wompi.co/"));
        OnStage.theActorInTheSpotlight().attemptsTo(PostTokenizeCard.withInformation(dataCard.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo();

    }
    @Then("he should see the token in the API´s response")
    public void heShouldSeeTheTokenInTheAPISResponse() {


    }








}
