package com.rentingcolombia.certification.proxywompi.tasks;

import com.rentingcolombia.certification.proxywompi.models.LoginResponse;
import com.rentingcolombia.certification.proxywompi.models.PaymentSourceRequest;
import com.rentingcolombia.certification.proxywompi.models.TokenizationRequest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostGeneratePaymentSource implements Task {
    private  final PaymentSourceRequest paymentSourceRequest;
    public static LoginResponse loginResponse;

    public PostGeneratePaymentSource(PaymentSourceRequest paymentSourceRequest) {
        this.paymentSourceRequest = paymentSourceRequest;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("v1/tokens/cards")
                .with(requestSpecification -> requestSpecification.body(paymentSourceRequest)
                        .header("Content-Type","application/json")
                        .header("Authorization",loginResponse.getToken())
        ));
    }
    public static PostGeneratePaymentSource withInformation (PaymentSourceRequest paymentSourceRequest){
        return Tasks.instrumented(PostGeneratePaymentSource.class, paymentSourceRequest);
    }
}
