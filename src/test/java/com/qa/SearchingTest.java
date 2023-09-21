package com.qa;

import com.codeborne.selenide.Selenide;
import com.qa.page.MainSearchingPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SearchingTest {
    private final MainSearchingPage mainPage = new MainSearchingPage();

    @Test(description = "Searching by 'PavelMal github'")
    public void searchByText() {
        open("https://yandex.com/");
        mainPage.headlineLogoShouldBe(visible);

        mainPage.searchByText("PavelMal github");

        Selenide.sleep(10000);
    }
}