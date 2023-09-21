package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class PassportPage {

    private final SelenideElement passportModal = $("[class=\"passp-auth-content\"]");


    @Step("Passport modal window should be: {condition}")
    public void passportModalShouldBe(Condition condition) {
        passportModal.shouldBe(condition);
    }
}