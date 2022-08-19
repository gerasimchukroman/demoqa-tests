package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class PracticeFormTests {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        registrationFormPage.openPage()
                            .setFirstName("Ivan")
                            .setLastName("Ivanov")
                            .setUserEmail("ab@ab.com")
                            .setGender("Female")
                            .setUserNumber("8999999999")
                            .setBirthDate("1","November", "1994")
                            .setSubjects( "Maths")
                            .setHobbies("Reading")
                            .setUploadPicture( "img/23.png")
                            .setCurrentAdress("Pushkina street, Kolotuchkina home")
                            .setStateAndCity("NCR","Delhi" );

        $("input").pressEnter();

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ivan"),
                text("Ivanov"),
                text("Ivanov"),
                text("8999999999"),
                text("Female"),
                text("01 November,1994"),
                text("Maths"),
                text("Reading"),
                text("23.png"),
                text("Pushkina street, Kolotuchkina home"),
                text("NCR Delhi"));
    }
}
