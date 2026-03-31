package lesson6;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreiShould() {
        // открыть страницу
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому автору
        $("div.BorderGrid").$(byText("Contributors")).closest(".BorderGrid-cell").$$("ul li").get(0).hover();
        // проверка во всплывающе окне
        $(".Popover").shouldHave(visible).$(byText("Andrei Solntsev")).shouldBe(visible);
        sleep(3000);
    }
}
