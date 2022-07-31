package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormTests {

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        CheckEmpty.nothingElse();
        FillForm.fillData();
        СheckEquals.textExist();
    }

    @AfterAll
    static void finitaLaCommedia() {
        CheckEmpty.nothingElse();
        System.out.println("That's all, Folks!");
    }
}
