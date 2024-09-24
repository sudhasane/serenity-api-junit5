package com.serenity.steps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Step;


import static net.serenitybdd.rest.SerenityRest.rest;


public class GetStudentsSteps extends BaseSteps {


    @Step("Get students ")
    public void getStudents() {
        Response response = rest().given()
                .header("Content-Type", ContentType.JSON)
                .get("/list").then().statusCode(200).extract().response();

    }

    @Step("Get students with Id")
    public void getStudentsWithID(String id) {
        Response response = rest().given()
                .header("Content-Type", ContentType.JSON)
                .get("/" + id).then().statusCode(200).extract().response();

    }

}
