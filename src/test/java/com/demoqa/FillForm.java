package com.demoqa;

import java.io.File;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;

public class FillForm {
    static void FillData() {
        $("#firstName").setValue(Data.firstName);    // #firstName вместо [id=firstName]
        $("#firstName").shouldHave(value(Data.firstName));
        $("#lastName").setValue(Data.lastName);
        $("#userEmail").setValue(Data.userEmail);
        $("[for = gender-radio-3]").click();    //[for = gender-radio-3] вместо label[for="gender-radio-3"]
        $("#userNumber").setValue(Data.userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText(Data.month);
        $(".react-datepicker__year-select").selectOptionContainingText(Data.year);
        $(".react-datepicker__day--017").click();  //можно задать еще как div[aria-label="Choose Wednesday, June 17th, 1987"
        $("#subjectsInput").setValue(Data.subjects0).pressEnter();
        $("#subjectsInput").setValue(Data.subjects1).pressEnter();
        $("#subjectsInput").setValue(Data.subjects2).pressEnter();
        $("#subjectsInput").setValue(Data.subjects3).pressEnter();
        $("#subjectsInput").setValue(Data.subjects4).pressEnter();
        $("#subjectsInput").setValue(Data.subjects5).pressEnter();
        $("#subjectsInput").setValue(Data.subjects6).pressEnter();
        $("#subjectsInput").setValue(Data.subjects7).pressEnter();
        $("#subjectsInput").setValue(Data.subjects8).pressEnter();
        $("#subjectsInput").setValue(Data.subjects9).pressEnter();
        $("#subjectsInput").setValue(Data.subjects10).pressEnter();
        $("#subjectsInput").setValue(Data.subjects11).pressEnter();
        $("#subjectsInput").setValue(Data.subjects12).pressEnter();
        $("#subjectsInput").setValue(Data.subjects13).pressEnter();
        $("[for = hobbies-checkbox-1]").click();    //[for = hobbies-checkbox-1] вместо label[for=\"hobbies-checkbox-1\"
        $("[for = hobbies-checkbox-2]").click();
        $("[for = hobbies-checkbox-3]").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/Alice.png"));
        $("#currentAddress").setValue(Data.currentAddress);
        $("#react-select-3-input").setValue(Data.state).pressEnter();
        $("#react-select-4-input").setValue(Data.city).pressEnter();
        $("#submit").click();
    }
}
