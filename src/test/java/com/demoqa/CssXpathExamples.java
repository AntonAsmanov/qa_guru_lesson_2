package com.demoqa;

import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void cssXpathExamples() {
        $("[data-testid=email]").setValue("a@a.com");
        $(by("data-testid","email")).setValue("a@a.com");

        $("[id=email]").setValue("a@a.com");
        $("#email").setValue("a@a.com");
        $(byId("email")).setValue("a@a.com");
        $(By.id("email")).setValue("a@a.com");

        $x("//*[@id='email']").setValue("a@a.com");
        $(By.xpath("//*[@id='email']")).setValue("a@a.com");

        $("[class=login_form_input_bot").setValue("a@a.com");
        $(".login_form_input_bot").setValue("a@a.com");
        $(".inputtext.login_form_input_bot").setValue("a@a.com");
        $("input.inputtext.login_form_input_bot").setValue("a@a.com");

        $x("//input.[@class='login_form_input_bot']").setValue("a@a.com");
        $x("//input.[@class='login_form_input_bot']").setValue("a@a.com");

        // Для вложения: родительский див с классом .inputtext, внутри инпут с классом .login_form_input_bot
        $(".inputtext .login_form_input_bot").setValue("a@a.com");
        $(".inputtext").$(".login_form_input_bot").setValue("a@a.com");


        // <div>Hello qa.guru</div>
        $x("//div[text()='Hello qa.guru']");
        $x("//div[contains(text(), 'llo qa.guru'");
        $x("//div[text()[contains(., 'llo qa.guru'");
        $(byText("Hello qa.guru"));
        $(withText("llo qa.guru"));


    }
}
