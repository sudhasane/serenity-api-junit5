package com.serenity.steps;

import com.serenity.steps.utils.TestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Step;


public class CreateStudentSteps extends BaseSteps {
    TestUtils utils = new TestUtils();

    @Step("Create New student ")
    public void createStudent() {
        String body = utils.readJsonFromFile().toString();
        Response response = rest().given()
                .header("Content-Type", ContentType.JSON)
                .log().all()
                .when().body(body).post()
                .then().log().all()
                .extract().response();

    }
}
