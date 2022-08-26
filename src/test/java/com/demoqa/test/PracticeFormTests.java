package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


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

        registrationFormPage.input();

        // examination

        registrationFormPage.modalTitleInput("Thanks for submitting the form");
        registrationFormPage.tableResponsive("Ivan");
        registrationFormPage.tableResponsive("Ivanov");
        registrationFormPage.tableResponsive("8999999999");
        registrationFormPage.tableResponsive("Female");
        registrationFormPage.tableResponsive("01 November,1994");
        registrationFormPage.tableResponsive("Reading");
        registrationFormPage.tableResponsive("23.png");
        registrationFormPage.tableResponsive("Pushkina street, Kolotuchkina home");
        registrationFormPage.tableResponsive("NCR Delhi");

    }
}
