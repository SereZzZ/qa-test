package RandomData;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static lesson10.test.TestData.*;
import static pageObjects.TestBase.RANDOM;

public class RandomDataGenerationTestForms {

    public static String getRandomString(int length) {
        // String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopgrtuvwxyz";

        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String getRandomEmail(int length) {
        return getRandomString(length) + "@mail.ru";
    }

    /**
     * Возвращает случайную фамилию из предопределённого списка.
     * @return случайная фамилия (String)
     */
    public static String getRandomLastName() {
        int randomIndex = RANDOM.nextInt(LAST_NAMES.length);
        return LAST_NAMES[randomIndex];
    }

}
