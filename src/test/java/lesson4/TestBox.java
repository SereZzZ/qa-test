package lesson4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBox {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void formTest(){
        open("https://demoqa.ru/qa-auto/elements/textbox");
        $("[id=fullName]").setValue("Sergey Gavriliv");
        // или так $("[#fullName]").setValue("Sergey Gavriliv");
        $("[name=email]").setValue("Sergey.gavriliv@mail.ru");
        $("[id=currentAddress]").setValue("Тверь");
        $("[id=permanentAddress]").setValue("Тоже Тверь");
        $(byText("Отправить")).click();
        $("[class=space-y-3]").shouldHave(text("Sergey Gavriliv"), text("Sergey.gavriliv@mail.ru"), text("Тверь"), text("Тоже Тверь"));
    }
}
