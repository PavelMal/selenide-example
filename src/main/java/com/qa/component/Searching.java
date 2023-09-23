package com.qa.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;

public class Searching {

    private final SelenideElement searching = $("[class=\"search3__inner\"]");
    private final SelenideElement textInput = $("[id=\"text\"]");
    private final SelenideElement findButton = $("[class=\"search3__button mini-suggest__button\"]");
    private final SelenideElement clearData = $("[class=\"search3__action search3__clear mini-suggest__input-clear\"]");
    private final SelenideElement popUpSearching = $("[class=\"mini-suggest__popup-content\"]");

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

    @Step("Pop up wit suggested content should be: {condition}")
    public void popUpContentShouldBe(Condition condition) {
        popUpSearching.shouldBe(condition);
    }

    @Step("Clear data in searching field")
    public void clearDataInSearching() {
        clearData.click();
    }

    @Step("Check text in searching field: {text}")
    public void checkTextInSearching(String text) {
        textInput.shouldHave(value(text));
    }
}