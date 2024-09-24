package com.serenity.steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.di.SerenityInfrastructure;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.model.util.EnvironmentVariables;


import java.nio.charset.StandardCharsets;

public class BaseSteps {
    private static EnvironmentVariables env;
    private static final RequestSpecification spec;

    static {
       final RestAssuredConfig config = RestAssuredConfig.newConfig()
                .encoderConfig(EncoderConfig.encoderConfig().defaultContentCharset(StandardCharsets.UTF_8));
        final RequestSpecBuilder specBuilder = new RequestSpecBuilder()
                .setConfig(config)
                .setBaseUri(EnvironmentSpecificConfiguration.from(getEnvVars()).getProperty("baseurl"))
                .setRelaxedHTTPSValidation();

        spec = specBuilder.build();
    }

    public static EnvironmentVariables getEnvVars(){
        return SerenityInfrastructure.getEnvironmentVariables();
    }

    public RequestSpecification rest() {
        return SerenityRest.given(spec);
    }
}
