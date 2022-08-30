package com.demoqa.test;

import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.demoqa.test.TestData.*;


public class PracticeFormTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();


    @Test
    void fillFormTest() {

        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setGender(gender)
                .setUserNumber(userNumber)
                .setBirthDate(day, month, year)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setUploadPicture(uploadPicture)
                .setCurrentAdress(currentAdress)
                .setStateAndCity(state, city);

        registrationFormPage.input();

        // examination

        registrationFormPage.modalTitleInput("Thanks for submitting the form");
        registrationFormPage.tableResponsive(firstName);
        registrationFormPage.tableResponsive(lastName);
        registrationFormPage.tableResponsive(userNumber);
        registrationFormPage.tableResponsive(gender);
        registrationFormPage.tableResponsive(day + month + year);
        registrationFormPage.tableResponsive(hobbies);
        registrationFormPage.tableResponsive(uploadPicture);
        registrationFormPage.tableResponsive(currentAdress);
        registrationFormPage.tableResponsive(state + city);

    }
}
