package lesson9.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate() {

        $("[id=dateOfBirth]").click();
        $(byText("14")).click();
        $("body").click();
    }
}
