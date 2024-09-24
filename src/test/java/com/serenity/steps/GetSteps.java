package com.serenity.steps;

import net.serenitybdd.annotations.Step;

public class GetSteps {

    @Step("sample test")
    public void verifyGetTest(){
        System.out.println("This is first serenity test");
    }

    @Step("even numbers test")
    public void numberPr(){
        for(int i=0; i<=400; i++){
            if(i % 2 ==0 ) {
                System.out.println(i);
            }
        }
    }

    @Step("even numbers")
    public void numberPr1(){
        for(int i=0; i<=100; i++){
            System.out.println(i);
        }
    }

}
