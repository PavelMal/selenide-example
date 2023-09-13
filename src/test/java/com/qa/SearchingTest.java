package com.qa;

import com.codeborne.selenide.Selenide;
import com.qa.page.MainPage;
import org.testng.annotations.Test;

public class SearchingTest {

    @Test
    public void checker() {
        MainPage mainPage = new MainPage();
        Selenide.open("https://yandex.com/");
        mainPage.search("hello");

        Selenide.sleep(10000);
    }
}