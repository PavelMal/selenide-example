package com.qa;

import com.qa.page.MainSearchingPage;
import com.qa.page.PassportPage;
import com.qa.page.SearchedResultPage;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected final MainSearchingPage mainPage = new MainSearchingPage();
    protected final PassportPage passportPage = new PassportPage();
    protected final SearchedResultPage searchedResultPage = new SearchedResultPage();

    @BeforeTest
    public void setUpBaseURL() {
        open("https://yandex.com/");
    }
}