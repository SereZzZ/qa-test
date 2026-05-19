package lesson9.formPageObjectsTest;

import org.junit.jupiter.api.Test;
import pageObjects.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class FormsPageObjectsTest  extends TestBase {

    @Test
    void formsPageObjectsTest(){
        String
                userName = "Сергей",
                last = "gtnhjd",
                email = "Serezha.serez@mail.ru",
                phoneNumber = "89969236311",
                address = "Тверь",
                state = "Тверская область",
                city = "Тверь";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(last)
                .setEmail(email)
                .setGenderMan()
                .setPhone(phoneNumber)
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

