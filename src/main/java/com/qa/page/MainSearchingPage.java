package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.qa.component.Searching;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainSearchingPage {

    private final Searching searching = new Searching();
    private final SelenideElement loginButton = $("[data-statlog=\"headline.enter\"]");
    private final SelenideElement weatherInfo = $("[data-statlog=\"informers.weather\"]");

    @Step("Input text into searching: {text}")
    public void searchByText(String text) {
        searching.inputTextToSearch(text);
        searching.clickOnFindButton();
    }

    @Step("Click on login button")
    public void clickOnLogIn() {
        loginButton.click();
    }

    @Step("Weather info should be {condition}")
    private void weatherInfoShouldBe(Condition condition) {
        weatherInfo.shouldBe(condition);
    }
}