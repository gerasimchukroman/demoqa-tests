package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

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


        String value = "Female";


        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail );
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(userNumber);

        //Date of Birth
       $(".react-datepicker__month-select").selectOption("November");
       $(".react-datepicker__year-select").selectOption("1994");
       $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();


        //Subjects
        //Hobbies
        //Picture

        $("#currentAddress").setValue(currentAddress);

        //State and city
    }
}
