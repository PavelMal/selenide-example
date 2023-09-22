package com.qa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class SearchingTest extends BaseTest{

    @Test(description = "Searching by 'PavelMal github'")
    public void searchByText() {
        mainPage.headlineLogoShouldBe(visible);

        mainPage.searchByText("PavelMal github");

        searchedResultPage.checkAmountSearchedItemsGreaterThatOne();
        searchedResultPage.firstSearchedItemShouldContainText("PavelMal (Pavel) · GitHub");
    }
}