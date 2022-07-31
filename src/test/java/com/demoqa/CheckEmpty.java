package com.demoqa;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.$;

public class CheckEmpty {
    static void nothingElse() {
        $("#firstName").shouldBe(empty);
        $("#lastName").shouldBe(empty);
        $("#userEmail").shouldBe(empty);
        $("#userNumber").shouldBe(empty);
        $("#subjectsInput").shouldBe(empty);
        $("#currentAddress").shouldBe(empty);
        $("#react-select-3-input").shouldBe(empty);
        $("#react-select-4-input").shouldBe(empty);
    }
}
