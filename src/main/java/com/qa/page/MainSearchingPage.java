package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.qa.component.Searching;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainSearchingPage {

    private final Searching searching = new Searching();
    private final SelenideElement loginButton = $("[class=\"home-link2 headline__personal-enter headline__personal-enter home-link2_color_black\"]");
    private final SelenideElement weatherInfo = $("[data-statlog=\"informers.weather\"]");
    private final SelenideElement headlineLogo = $("[class=\"home-link2 headline__logo\"]");

    public void searchByText(String text) {
        searching.inputTextToSearch(text);
        searching.clickOnFindButton();
    }

    public void inputText(String text) {
        searching.inputTextToSearch(text);
    }

    public void clearData() {
        searching.clearDataInSearching();
    }

    @Step("Click on login button")
    public void clickOnLogIn() {
        loginButton.click();
    }

    @Step("Weather info should be {condition}")
    public void weatherInfoShouldBe(Condition condition) {
        weatherInfo.shouldBe(condition);
    }

    @Step("Headline logo should be {condition}")
    public void headlineLogoShouldBe(Condition condition) {
        headlineLogo.shouldBe(condition);
    }
}