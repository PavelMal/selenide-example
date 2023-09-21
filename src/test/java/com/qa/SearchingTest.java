package com.qa;

import com.codeborne.selenide.Selenide;
import com.qa.page.MainSearchingPage;
import com.qa.page.SearchedResultPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SearchingTest {
    private final MainSearchingPage mainPage = new MainSearchingPage();
    private final SearchedResultPage searchedResultPage = new SearchedResultPage();

    @Test(description = "Searching by 'PavelMal github'")
    public void searchByText() {
        open("https://yandex.com/");
        mainPage.headlineLogoShouldBe(visible);

        mainPage.searchByText("PavelMal github");

        searchedResultPage.checkAmountSearchedItemsGreaterThatOne();
        searchedResultPage.firstSearchedItemShouldContainText("PavelMal (Pavel) · GitHub");
    }
}