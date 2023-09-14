package com.qa.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Searching {

    private final SelenideElement searching = $("[class=\"search3__inner\"]");

    @Step("Input text to search: {text}")
    public void inputTextToSearch(String text) {
        searching.val(text);
    }

    @Step("Searching element should be: {condition}")
    public void searchingElementShouldBe(Condition condition) {
        searching.shouldBe(condition);
    }
}