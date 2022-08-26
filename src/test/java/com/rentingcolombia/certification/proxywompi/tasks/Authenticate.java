package com.rentingcolombia.certification.proxywompi.tasks;

import com.rentingcolombia.certification.proxywompi.models.LoginResponse;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

public class Authenticate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Post.to("/api/Token").withRequest(
                request->request.body("")
                        .header("Content-Type","application/json")
                        .header("x-rentingcom-from", "inside-cluster")
        ));
        LoginResponse.setLoginResponse(SerenityRest.lastResponse().as(LoginResponse.class));
        System.out.println(LoginResponse.getLoginResponse().toString());
    }


    }

