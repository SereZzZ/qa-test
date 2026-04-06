package homework7;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDrop(to($("#column-b")));
        $("#column-a").shouldHave(text("B"));

    }

    @Test
    public void dragAndDropUsingActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-b").shouldHave(text("A"));
        // clickAndHold($("#column-a")) — зажимает левую кнопку мыши на элементе A.
        // moveToElement($("#column-b")) — перемещает курсор (с зажатой кнопкой) на элемент B.
        // release() отпускаем кнопку мыши
        // С perform() — действие выполняется: (обязательная команда для работы действий)
    }
}
