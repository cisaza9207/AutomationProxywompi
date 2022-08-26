package com.rentingcolombia.certification.proxywompi.definitions;

import com.rentingcolombia.certification.proxywompi.models.TokenizationRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

   @DataTableType
    public TokenizationRequest tokenizationRequest (Map<String,String> data){
        TokenizationRequest tokenizationRequest = new TokenizationRequest();
       tokenizationRequest.setNumber(data.get("number"));
       tokenizationRequest.setCvc(data.get("cvc"));
       tokenizationRequest.setExp_month(data.get("exp_month"));
       tokenizationRequest.setExp_year(data.get("exp_year"));
       tokenizationRequest.setCard_holder(data.get("card_holder"));
       return tokenizationRequest;
   }


}
