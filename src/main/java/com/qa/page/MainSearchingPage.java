package com.qa.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainSearchingPage {

    private final SelenideElement searching = $("[id=\"text\"]");

    @Step("Input text into searching: {text}")
    public void search(String text) {
        searching.val(text);
        searching.pressEnter();
    }
}