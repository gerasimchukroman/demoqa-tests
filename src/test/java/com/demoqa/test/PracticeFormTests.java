package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class PracticeFormTests {
    @BeforeAll
    static void beforeAll() {
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
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(userNumber);

        //Date of Birth
       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").selectOption("November");
       $(".react-datepicker__year-select").selectOption("1994");
       $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();

        //Subjects
        $("#subjectsInput").setValue("Maths").pressEnter();

        //Hobbies
        $("#hobbiesWrapper").$(byText("Reading")).click();

        //Picture
        $("#uploadPicture").uploadFromClasspath("img/23.png");


        $("#currentAddress").setValue(currentAddress);

        //State and city
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

       // $("#submit").scrollIntoView(true);
        $("input").pressEnter();


        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName),
                text(lastName),
                text(userEmail),
                text(userNumber),
                text("Female"),
                text("01 November,1994"),
                text("Maths"),
                text("Reading"),
                text("23.png"),
                text(currentAddress),
                text("NCR Delhi"));
    }
}
