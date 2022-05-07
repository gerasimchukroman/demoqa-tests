package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized = true;
    }
    @Test
    void fillFormTest(){

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String userEmail = "ab@ab.com";
        String userNumber = "8999999999";
        String currentAddress = "Pushkina street, Kolotuchkina home";


        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail );

        //Gender

        $("#userNumber").setValue(userNumber);

        //Date of Birth
        //Subjects
        //Hobbies
        //Picture

        $("#currentAddress").setValue(currentAddress);

        //State and city
    }
}
