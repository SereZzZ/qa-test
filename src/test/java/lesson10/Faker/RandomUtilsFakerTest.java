package lesson10.Faker;

import org.junit.jupiter.api.Test;
import pageObjects.TestBase;

import static lesson10.Faker.FakerGeneration.*;

public class RandomUtilsFakerTest extends TestBase {

    @Test
    void formsPageObjectsTest(){

        registrationPage.openPage()
                .setFirstName(userNames)
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
