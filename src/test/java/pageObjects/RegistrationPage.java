package pageObjects;

import com.codeborne.selenide.SelenideElement;
import lesson9.components.CalendarComponent;
import lesson9.components.RegistrationModal;
import lesson9.components.UploadFileComponent;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public static SelenideElement firstNameInput = $("[name=firstName]");
    public static SelenideElement emailInput = $("[id=email]");
    public static SelenideElement genderInputMan = $("[for=gender-male]");
    public static SelenideElement phone = $("[id=mobile]");
    public static SelenideElement hobby = $("#hobby-sports");
    public static SelenideElement address = $("#currentAddress");
    public static SelenideElement state = $("#state");
    public static SelenideElement city = $("#city");
    public static SelenideElement lastNameInput = $("[name=lastName]");

    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationModal registrationModal = new RegistrationModal();
    UploadFileComponent uploadFileComponent = new UploadFileComponent();

    public RegistrationPage openPage() {

        open("https://demoqa.ru/qa-auto/forms");
        return this;
    }

    // 1) Тут мы вызываем метод и задаем значение непосредственно в тесте
    // Мы можем написать метод непосредственно указав элемент в явном виде
    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    // 2) Тут мы задаем значение в методе и отдаем его в тест
    // А тут мы обращаемся к элементу как к созданной сущности
    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    //так же чтобы не плодить в коде pageObjects.RegistrationPage мы можем заменить void на RegistrationPage и возвращать RegistrationPage через команду return this; Пример весь код))
    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGenderMan() {
        genderInputMan.click();
        return this;
    }

    public RegistrationPage setPhone(String value) {
        phone.setValue(value);
        return this;
    }

    public RegistrationPage setBirtDate() {
        calendarComponent.setDate();
        return this;
    }

    public RegistrationPage setHobby() {
        hobby.click();
        return this;
    }

    public RegistrationPage setFile() {
        uploadFileComponent.setFoto();
        return this;
    }

    public RegistrationPage setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        state.setValue(value);
        return this;
    }

    public RegistrationPage setCity(String value) {
        city.setValue(value);
        return this;
    }

    public RegistrationPage sendForm() {
        registrationModal.sendTheRegistrationForm();
        return this;
    }

    public RegistrationPage modalVisible() {
        registrationModal.verifyModalVisible();
        return this;
    }
}

