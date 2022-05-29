package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1800x900";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void successfulTest() {
        open("/automation-practice-form");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Mark");
        $("#lastName").setValue("Born");
        $("#userEmail").setValue("Born@gloom.snail");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9500267340");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1988");
        $("[aria-label='Choose Saturday, December 10th, 1988']").click();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("test.png");

        $("#subjectsInput").sendKeys("m");
        $(byText("Maths")).click();
        $("#currentAddress").setValue("Palm Street");

        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Noida")).click();
        $("#submit").click();

        $(".modal-content").shouldHave(text("Mark"), text("Born"), text("Born@gloom.snail"),
                text("Male"), text("9500267340"), text("10 December,1988"),
                text("test.png"), text("Palm Street"),
                text("NCR"), text("Noida"), text("Thanks for submitting the form"));


    }
}
