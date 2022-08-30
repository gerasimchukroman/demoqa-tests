package com.demoqa.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;

public class TestData {
    Faker faker = new Faker();

    static String firstName,
           lastName ,
           userEmail ,
           gender ,
           userNumber ,
           day,
           month,
           year,
           subjects,
           hobbies,
           uploadPicture,
           currentAdress,
           state,
           city;

    @BeforeEach
    void prepareTestData(){
                firstName = faker.name().firstName();
                lastName = faker.name().lastName();
                userEmail = faker.internet().emailAddress();
                gender = "Female";
                userNumber = faker.phoneNumber().subscriberNumber(10);
                day = faker.number().numberBetween(1, 28) + "";
                month = "November";
                year = faker.number().numberBetween(1900, 2010) + "";
                subjects = "Maths";
                hobbies = "Reading";
                uploadPicture = "img/23.png";
                currentAdress = faker.address().fullAddress();
                state = "NCR";
                city = "Delhi";

    }

}
