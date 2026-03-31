package lesson6;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void sholdFindSelenideAtTheTop() {
        // открыть страничку
        open("https://github.com/");
        // ввести в поле поиска Selenide и нажать Search
        $("button.header-search-button").click(); // мы нашли <button> и класс(заменяем на .) с атрибутом header-search-button
        $("input#query-builder-test").setValue("selenide").pressEnter();
        // кликнуть на первый репозиторий из списка
        $$("[data-testid=results-list]").get(0).$("a").click(); // на первый элемент из листа или дерева можно кликнуть командой .get(немер элемента который начинается с 0) или командой .first!
        //проверить что нужная страница видна
        $("#repository-container-header").shouldHave(text("selenide"));
        sleep(3000);
    }
}
