package lesson4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Привет я перед тестом");
    }

    @AfterEach
    void beforeEach() {
        System.out.println("Привет я после теста");
    }

    @Test
    void returnTex() {
        System.out.println("hallo world!!");
    }
}
