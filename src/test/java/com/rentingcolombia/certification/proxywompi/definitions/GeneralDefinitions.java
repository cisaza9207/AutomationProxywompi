package com.rentingcolombia.certification.proxywompi.definitions;

import com.rentingcolombia.certification.proxywompi.tasks.Authenticate;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

public class GeneralDefinitions {
Authenticate authenticate = new Authenticate();
    @Before
    public void before(){
        SerenityRest.setDefaultParser(Parser.JSON);
        OnStage.setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("{actor} gets token")
    public void theUserGetsToken(Actor actor) {

        actor.whoCan(CallAnApi.at("http://rcclusterdevrc.eastus2.cloudapp.azure.com:9042"));
        actor.wasAbleTo(authenticate);
    }
}
