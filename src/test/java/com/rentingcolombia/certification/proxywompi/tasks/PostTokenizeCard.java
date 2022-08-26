package com.rentingcolombia.certification.proxywompi.tasks;

import com.rentingcolombia.certification.proxywompi.models.ExtractInformationCard;
import com.rentingcolombia.certification.proxywompi.models.Response;
import com.rentingcolombia.certification.proxywompi.models.TokenizationRequest;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.Tasks;
import org.json.JSONArray;
import org.json.JSONObject;

public class PostTokenizeCard implements Task {
    private final TokenizationRequest tokenizationRequest;
    public PostTokenizeCard(TokenizationRequest tokenizationRequest){
        this.tokenizationRequest = tokenizationRequest;
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
       actor.attemptsTo(Post.to("v1/tokens/cards")
               .with(requestSpecification -> requestSpecification.body(tokenizationRequest)
                       .header("Content-Type","application/json")
                       .header("publickey","pub_test_xbAQz028KI78xmEu9UvCi3n7piM0E2yp")
                       .header("Authorization","Bearer pub_test_xbAQz028KI78xmEu9UvCi3n7piM0E2yp"))
       );

        /*Response.setResponse(SerenityRest.lastResponse().as(Response.class));
        System.out.println("Este es el dato: " + Response.getResponse().getStatus());
        SerenityRest.lastResponse().prettyPrint();

        System.out.println("TEst"+SerenityRest.lastResponse()
                .getBody().toString());
        ExtractInformationCard extractInformationCard =new ExtractInformationCard(SerenityRest.lastResponse()
                .body().toString().replaceAll("",""));
        extractInformationCard.idCard();
*/
        String Variable = SerenityRest.lastResponse().getBody().jsonPath().getString("data.id");
        System.out.println("Variable = " + Variable);
    }
    public static PostTokenizeCard withInformation (TokenizationRequest tokenizationRequest){
        return Tasks.instrumented(PostTokenizeCard.class, tokenizationRequest);
    }
}
