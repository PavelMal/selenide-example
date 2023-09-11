package com.qa;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void checker() {
        Selenide.open("google.com");
        Selenide.sleep(10000);
    }
}