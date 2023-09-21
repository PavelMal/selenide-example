package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SearchedResultPage {
    private final SelenideElement headerDesktopLogo = $("[class=\"HeaderDesktopLogo HeaderDesktopLogo_lang_ru HeaderDesktop-Logo\"]");

    @Step("Header desktop logo should be: {condition}")
    public void headerDesktopLogoShouldBe(Condition condition) {
        headerDesktopLogo.shouldBe(condition);
    }
}