package lesson9.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationModal {

    public void verifyModalVisible() {
        $("[class=p-0]").shouldBe(visible);
    }

    public void sendTheRegistrationForm () {
        $(byText("Отправить")).click();
    }
}
