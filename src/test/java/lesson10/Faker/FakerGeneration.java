package lesson10.Faker;

import static pageObjects.TestBase.faker;

public class FakerGeneration {

    public static String
            userNames = faker.name().firstName(),
            last = faker.name().lastName(),
            email = faker.internet().emailAddress("en") ,
            phoneNumber = faker.phoneNumber().phoneNumber(),
            address = faker.address().fullAddress(),
            state = "Тверская область",
            city = "Тверь";
}
