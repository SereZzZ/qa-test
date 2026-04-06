package homework7;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoadingHeaderGitHub {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
    }

    @Test
    void enterprisePageChecks() {
        open("https://github.com");
        $$("button.js-details-target").findBy(text("Solutions")).hover();
        $(byText("Startups")).click();
        $(byText("Founders build the future on GitHub")).shouldBe(visible);
    }
}


