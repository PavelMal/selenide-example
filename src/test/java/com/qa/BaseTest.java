package com.qa;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.qa.page.MainSearchingPage;
import com.qa.page.PassportPage;
import com.qa.page.SearchedResultPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {
    protected final MainSearchingPage mainPage = new MainSearchingPage();
    protected final PassportPage passportPage = new PassportPage();
    protected final SearchedResultPage searchedResultPage = new SearchedResultPage();

    @BeforeTest
    public void setUpBaseURL() {
        open("https://yandex.com/");
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}