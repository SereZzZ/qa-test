package lesson9.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class UploadFileComponent {

    public static SelenideElement file = $("#picture-upload");

    public void setFoto() {
        file.uploadFromClasspath("Foto/maxresdefault.jpg");
    }
}
