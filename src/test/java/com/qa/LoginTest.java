package com.qa;

import com.codeborne.selenide.Selenide;
import com.qa.page.MainSearchingPage;
import com.qa.page.PassportPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    private final MainSearchingPage mainPage = new MainSearchingPage();
    private final PassportPage passportPage = new PassportPage();

    @Test(description = "Check login button redirect to yandex passport page")
    public void login() {
        open("https://yandex.com/");
        mainPage.headlineLogoShouldBe(visible);
        mainPage.clickOnLogIn();

        passportPage.passportModalShouldBe(visible);
    }
}