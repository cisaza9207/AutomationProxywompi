package com.rentingcolombia.certification.proxywompi.definitions;

import com.rentingcolombia.certification.proxywompi.models.PaymentSourceRequest;
import com.rentingcolombia.certification.proxywompi.tasks.PostGeneratePaymentSource;
import com.rentingcolombia.certification.proxywompi.tasks.PostTokenizeCard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

public class GeneratePaymentSourceDefinition {

    @When("the project called ProxyWompi's API for create a payment source whit the information")
    public void theProjectCalledProxyWompiSAPIForCreateAPaymentSourceWhitTheInformation(List<PaymentSourceRequest> paymentsourceInformation) {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("project").whoCan(CallAnApi.at("http://172.29.136.4/api"));
        OnStage.theActorInTheSpotlight().attemptsTo(PostGeneratePaymentSource.withInformation(paymentsourceInformation.get(0)));
        SerenityRest.lastResponse().prettyPrint();
    }

    @Then("he should see the encrypted token")
    public void heShouldSeeTheEncryptedToken() {

    }
}
