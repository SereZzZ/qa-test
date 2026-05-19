package lesson10.test;

import static RandomData.RandomDataGenerationTestForms.*;

public class TestData {

    public static String[] LAST_NAMES = {
            "Петров",
            "Иванов",
            "Гаврилив",
            "Шевцов"
    };


    public static String
            userName = getRandomString(1),
            lastName = getRandomLastName(),
            email = getRandomEmail(5),
            phoneNumbber = "89969236311",
            address = "Тверь",
            state = "Тверская область",
            city = "Тверь";
}


