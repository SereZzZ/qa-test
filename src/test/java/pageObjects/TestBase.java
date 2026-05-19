package pageObjects;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Locale;
import java.util.Random;

public class TestBase {

   public RegistrationPage registrationPage = new RegistrationPage();
    // Генератор случайных чисел
   public static Random RANDOM = new Random();
   public static Faker faker = new Faker(new Locale("ru"));

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
    }

    @BeforeEach
    public void setUp() {
        // Устанавливаем таймаут в 1 минуту = 60 000 миллисекунд
        Configuration.timeout = 60_000; // 60 seconds

    }
}
