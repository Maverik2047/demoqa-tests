package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultsComponents {
    public void checkResults(){
        $(".modal-content").shouldHave(text("Mark"), text("Born"), text("Born@gloom.snail"),
                text("Male"), text("9500267340"), text("10 December,1988"),
                text("test.png"), text("Palm Street"),
                text("NCR"), text("Noida"), text("Thanks for submitting the form"));


    }
}
