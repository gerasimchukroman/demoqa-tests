package com.demoqa.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {
    @Test
    void fillFormTest(){
        open("https://demoqa.com/automation-practice-form");
    }
}
