package lesson9;

import lesson9.components.UploadFileComponent;
import org.junit.jupiter.api.Test;
import pageObjects.TestBase;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormsPageObjectsTest  extends TestBase {

    @Test
    void formsPageObjectsTest(){
        String
                userName = "Сергей",
                email = "Serezha.serez@mail.ru",
                phoneNumbber = "89969236311",
                address = "Тверь",
                state = "Тверская область",
                city = "Тверь";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName()
                .setEmail(email)
                .setGenderMan()
                .setPhone(phoneNumbber)
                .setBirtDate()
                .setHobby()
                .setFile()
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .sendForm()
                .modalVisible();
    }
}

