package com.qa.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Searching {

    private final SelenideElement searching = $("[class=\"search3__inner\"]");
    private final SelenideElement textInput = $("[id=\"text\"]");
    private final SelenideElement findButton = $("[class=\"search3__button mini-suggest__button\"]");
    private final SelenideElement clearData = $("[class=\"search3__action search3__clear mini-suggest__input-clear\"]");

    @Step("Input text to search: {text}")
    public void inputTextToSearch(String text) {
        textInput.val(text);
    }

    @Step("Click on find button")
    public void clickOnFindButton() {
        findButton.click();
    }

    @Step("Searching element should be: {condition}")
    public void searchingElementShouldBe(Condition condition) {
        searching.shouldBe(condition);
    }

    @Step("Clear data in searching field")
    public void clearDataInSearching() {
        clearData.click();
    }
}