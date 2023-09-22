package com.qa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTest{

    @Test(description = "Check login button redirect to yandex passport page")
    public void login() {
        mainPage.headlineLogoShouldBe(visible);
        mainPage.clickOnLogIn();

        passportPage.passportModalShouldBe(visible);
    }
}