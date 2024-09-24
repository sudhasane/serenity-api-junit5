package com.serenity.apiTests;

import com.serenity.steps.CreateStudentSteps;
import com.serenity.steps.GetStudentsSteps;
import com.serenity.steps.utils.TestUtils;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@ExtendWith(SerenityJUnit5Extension.class)
public class GetStudentsTest {

    @Steps
    GetStudentsSteps steps;

    @Steps
    TestUtils testUtils;


    @Test
    @Title("Verify Get students")
    public void verifyGetStudents() {
        steps.getStudents();
    }


    @ParameterizedTest(name = "Verify Get each student details")
    @Tag("pttest")
    @ValueSource(strings = {"1", "2", "3"})
    public void verifyGetStudents1(String id) {
        steps.getStudentsWithID(id);
    }


}
