package com.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchedResultPage {
    private final SelenideElement headerDesktopLogo = $("[class=\"HeaderDesktopLogo HeaderDesktopLogo_lang_ru HeaderDesktop-Logo\"]");
    private final ElementsCollection searchedItems = $$("[class=\"serp-item serp-item_card\"]");

    @Step("Header desktop logo should be: {condition}")
    public void headerDesktopLogoShouldBe(Condition condition) {
        headerDesktopLogo.shouldBe(condition);
    }

    @Step("Amount of searched items is greater than 1")
    public void checkAmountSearchedItemsGreaterThatOne() {
        searchedItems.shouldBe(sizeGreaterThan(1));
    }
}