package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.StateAndCityComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    //Elements

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAdressInput = $("#currentAddress");


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value) {
        genderInput.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setBirthDate(String day, String month, String year) {
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegistrationFormPage setSubjects (String value){
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies (String value){
        hobbiesInput.$(byText(value)).click();
        return this;
    }
    public RegistrationFormPage setUploadPicture (String value) {
        uploadPictureInput.uploadFromClasspath(value);
        return this;
    }
    public RegistrationFormPage setCurrentAdress (String value) {
        currentAdressInput.setValue(value);
        return this;
    }
    public RegistrationFormPage setStateAndCity (String state, String city) {
        stateAndCityComponent.stateAndCity(state, city);
        return this;
    }

}
