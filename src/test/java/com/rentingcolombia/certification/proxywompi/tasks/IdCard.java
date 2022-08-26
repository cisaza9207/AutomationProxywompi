package com.rentingcolombia.certification.proxywompi.tasks;

import com.rentingcolombia.certification.proxywompi.models.ExtractInformationCard;
import com.rentingcolombia.certification.proxywompi.models.TokenizationRequest;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

public class IdCard implements Task {

    public IdCard() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       ExtractInformationCard extractInformationCard = new ExtractInformationCard(SerenityRest.lastResponse().toString());
        System.out.println("ExtractInformationCard.id = " + ExtractInformationCard.id);
    }


}
