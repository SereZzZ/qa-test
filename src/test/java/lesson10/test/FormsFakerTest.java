package lesson10.test;

import org.junit.jupiter.api.Test;
import pageObjects.TestBase;

import static lesson10.test.TestData.*;

public class FormsFakerTest extends TestBase {

    @Test
    void formsFacerTest() {

        registrationPage.openPage()
                .setFirstName(userName) //тут используеться метот с генерацией рандомных значений
                .setLastName(lastName)
                .setEmail(email)  //тут используем рандомный емайл
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

