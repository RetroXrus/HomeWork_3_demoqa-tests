package com.demoqa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class СheckEquals {
    static void textExist() {
        $("#example-modal-sizes-title-lg").shouldHave(text(Data.form));
        $("thead th",0).shouldHave(text(Data.tableColumn1));
        $("thead th",1).shouldHave(text(Data.tableColumn2));
        $("tbody tr",0).shouldHave(text(Data.tableColumn1_1),text(Data.firstName + " " + Data.lastName));
        $("tbody tr",1).shouldHave(text(Data.tableColumn1_2),text(Data.userEmail));
        $("tbody tr",2).shouldHave(text(Data.tableColumn1_3),text(Data.userGender));
        $("tbody tr",3).shouldHave(text(Data.tableColumn1_4),text(Data.userNumber));
        $("tbody tr",4).shouldHave(text(Data.tableColumn1_5),text(Data.date));
        $("tbody tr",5).shouldHave(text(
                Data.tableColumn1_6),
                text(Data.subjects0),
                text(Data.subjects1),
                text(Data.subjects2),
                text(Data.subjects3),
                text(Data.subjects4),
                text(Data.subjects5),
                text(Data.subjects6),
                text(Data.subjects7),
                text(Data.subjects8),
                text(Data.subjects9),
                text(Data.subjects10),
                text(Data.subjects11),
                text(Data.subjects12),
                text(Data.subjects13)
        );
        $("tbody tr",6).shouldHave(text(Data.tableColumn1_7),text(Data.hobbies));
        $("tbody tr",7).shouldHave(text(Data.tableColumn1_8),text(Data.picture));
        $("tbody tr",8).shouldHave(text(Data.tableColumn1_9),text(Data.currentAddress));
        $("tbody tr",9).shouldHave(text(Data.tableColumn1_10),text(Data.state + " " + Data.city));
        $("#closeLargeModal").click();
    }
}
