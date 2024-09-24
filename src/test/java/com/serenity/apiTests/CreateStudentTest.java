package com.serenity.apiTests;

import com.serenity.steps.CreateStudentSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityJUnit5Extension.class)
public class CreateStudentTest {
    @Steps
    CreateStudentSteps steps;

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent() {
        steps.createStudent();
        System.out.println("Test1 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent2() {
        steps.createStudent();
        System.out.println("Test2 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent3() {
        steps.createStudent();
        System.out.println("Test3 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent4() {
        steps.createStudent();
        System.out.println("Test4 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent5() {
        steps.createStudent();
        System.out.println("Test5 " + Thread.currentThread().getName());
    }

    @Test
    @Tag("create")
    @Title("Verify create sudent")
    public void verifyCreateNewStudent6() {
        steps.createStudent();
        System.out.println("Test6 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent7() {
        steps.createStudent();
        System.out.println("Test7 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent8() {
        steps.createStudent();
        System.out.println("Test8 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent9() {
        steps.createStudent();
        System.out.println("Test9 " + Thread.currentThread().getName());
    }

    @Test
    @Title("Verify create sudent")
    public void verifyCreateNewStudent10() {
        steps.createStudent();
        System.out.println("Test10 " + Thread.currentThread().getName());
    }
}
