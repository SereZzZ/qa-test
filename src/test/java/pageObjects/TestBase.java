package pageObjects;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
   public RegistrationPage registrationPage = new RegistrationPage();

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
