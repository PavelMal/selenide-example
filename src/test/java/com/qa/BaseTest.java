package com.qa;

import com.qa.page.MainSearchingPage;
import com.qa.page.PassportPage;
import com.qa.page.SearchedResultPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {
    protected final MainSearchingPage mainPage = new MainSearchingPage();
    protected final PassportPage passportPage = new PassportPage();
    protected final SearchedResultPage searchedResultPage = new SearchedResultPage();

    @BeforeMethod
    public void setUpBaseURL() {
        open(System.getProperty("baseUrl"));
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterMethod
    public void closeBrowserAfterTest() {
        closeWebDriver();
    }
}