package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public CalendarComponents setDate(String month,String year){
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $("[aria-label='Choose Saturday, December 10th, 1988']").click();
        return this;
    }
}
