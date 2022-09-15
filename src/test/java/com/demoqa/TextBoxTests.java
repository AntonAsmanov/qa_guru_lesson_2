package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest(){
        String name = "Egor";
        String email = "Egor@egor.com";
        String address1 = "Some address 1";
        String address2 = "Another Address 2";

        String nameInput = "[id=userName]";




        open("/text-box");
        $(nameInput).setValue(name);
        $("[id=userEmail]").setValue(email);
        $("[id=currentAddress]").setValue(address1);
        $("[id=permanentAddress]").setValue(address2);
        $("[id=submit]").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text(email));
        $("#output #currentAddress").shouldHave(text(address1));
        $("#output #permanentAddress").shouldHave(text(address2));

    }
}
