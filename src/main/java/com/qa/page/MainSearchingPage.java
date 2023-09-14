package com.qa.page;

import com.qa.component.Searching;
import io.qameta.allure.Step;

public class MainSearchingPage {

    private final Searching searching = new Searching();

    @Step("Input text into searching: {text}")
    public void searchByText(String text) {
        searching.inputTextToSearch(text);
        searching.clickOnFindButton();
    }
}