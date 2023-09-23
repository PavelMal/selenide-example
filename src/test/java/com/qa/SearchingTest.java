package com.qa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;

public class SearchingTest extends BaseTest{

    @Test(description = "Searching by 'PavelMal github'")
    public void searchByText() {
        mainPage.headlineLogoShouldBe(visible);

        mainPage.searchByText("PavelMal github");

        searchedResultPage.checkAmountSearchedItemsGreaterThatOne();
        searchedResultPage.firstSearchedItemShouldContainText("PavelMal (Pavel) · GitHub");
    }

    @Test(description = "Clear data in searching")
    public void clearDataInSearching() {
        mainPage.headlineLogoShouldBe(visible);

        mainPage.inputText("PavelMal github");
        mainPage.checkTextInSearching("PavelMal github");
        mainPage.clearData();
        mainPage.checkTextInSearching("");
    }

    @Test(description = "Popup content should be visible in case of typing")
    public void popUpContentShouldBeVisible() {
        mainPage.headlineLogoShouldBe(visible);

        mainPage.inputText("PavelMal github");
        mainPage.popupContentShouldBe(visible);

        mainPage.clearData();
        mainPage.popupContentShouldBe(not(visible));
    }
}