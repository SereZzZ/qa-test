package homework4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Forms {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void formsTest(){
        open("https://demoqa.ru/qa-auto/forms");
        $("[name=firstName]").setValue("Сергей");
        $("[name=lastName]").setValue("Петров");
        $("[id=email]").setValue("Sergey.sergey@mail.ru");
        $("[for=gender-male]").click();
        //так тоже можно $(byText("Мужской")).click();
        $("[id=mobile]").setValue("89969232323");
        $("[id=dateOfBirth]").click();
        $("button[role=combobox]:has(span[aria-label=Месяц])").click();
        $(byText("Апрель")).click();
        $("button[role=combobox]:has(span[aria-label=Год])").click(); //Найти все кнопки с role="combobox", внутри которых есть <span aria-label="Год">
        $(byText("2020")).click();
        $(byText("8")).click();
        $("body").click();
        $("#hobby-sports").click();
        $("#picture-upload").uploadFromClasspath("Foto/maxresdefault.jpg");
        $("#currentAddress").setValue("Тверь");
        $("#state").setValue("Тверская область");
        $("#city").setValue("Тверь");
        $(byText("Отправить")).click();
        $("[class=p-0]").shouldBe(visible);
    }
}
