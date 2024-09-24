package com.serenity.steps.utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class TestUtils {
    private static final RandomNumberGenerator generator = RandomNumberGenerator.getInstance();

    public JSONObject readJsonFromFile() {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;

        try (FileReader reader = new FileReader("src/test/resources/payload/student.json")) {
            Object obj = null;
            try {
                obj = jsonParser.parse(reader);
                jsonObject = (JSONObject) obj;
                jsonObject.replace("id", RandomStringUtils.randomNumeric(3));
                jsonObject.replace("email", RandomStringUtils.randomAlphanumeric(8) + "@mail.com");
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public static String randomEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }


}
