package lesson9.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate() {

        $("[id=dateOfBirth]").click();
        $("button[role=combobox]:has(span[aria-label=Месяц])").click();
        $(byText("Май")).click();
        $("button[role=combobox]:has(span[aria-label=Год])").click(); //Найти все кнопки с role="combobox", внутри которых есть <span aria-label="Год">
        $(byText("2020")).click();
        $(byText("8")).click();
        $("body").click();
    }
}
