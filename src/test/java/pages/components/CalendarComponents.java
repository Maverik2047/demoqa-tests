package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public CalendarComponents setDate(String month,String year,String day){
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
        return this;
    }
}
