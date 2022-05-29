package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class AutomationFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1800x900";
        Configuration.holdBrowserOpen=true;
    }


    @Test
    void successfulTest() {
        open("/automation-practice-form");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=firstName]").setValue("Mark");
        $("[id=lastName]").setValue("Born");
        $("[id=userEmail]").setValue("Born@gloom.snail");

        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue("9500267340");

        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1988");
        $("[aria-label='Choose Saturday, December 10th, 1988']").click();

        $("[for=hobbies-checkbox-1]").click();
        $("[id=uploadPicture]").uploadFile(new File("src\\test\\resources\\test.png"));
        $("#subjectsInput").sendKeys("m");
        $(byText("Maths")).click();
        $("[id=currentAddress]").setValue("Palm Street");

        $("[id=state]").click();
        $(byText("NCR")).click();

        $("[id=city]").click();
        $(byText("Noida")).click();
        $("[id=submit]").click();

        $(".modal-content").shouldHave(text("Mark"),text("Born"),text("Born@gloom.snail"),
                text("Male"),text("9500267340"),text("10 December,1988"),
                text("test.png"),text("Palm Street"),
                text("NCR"),text("Noida"),text("Thanks for submitting the form"));




    }
}
