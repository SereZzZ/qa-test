package lesson9;

import org.junit.jupiter.api.Test;
import pageObjects.TestBase;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormsPageObjectsTest  extends TestBase {

    @Test
    void formsPageObjectsTest(){
        String userName = "Сергей";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName()
                .setEmail("Serezha.serez@mail.ru")
                .setGenderMan()
                .setPhone()
                .setBirtDate();
        //так тоже можно $(byText("Мужской")).click(); вместо $("[for=gender-male]")
        $("#hobby-sports").click();
        $("#picture-upload").uploadFromClasspath("Foto/maxresdefault.jpg");
        $("#currentAddress").setValue("Тверь");
        $("#state").setValue("Тверская область");
        $("#city").setValue("Тверь");
        $(byText("Отправить")).click();
        registrationPage.modalVisible();
    }
}

