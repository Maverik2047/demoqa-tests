package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class PictureUpload {
    public PictureUpload setPicture(){
        $("#uploadPicture").uploadFromClasspath("test.png");
        return this;
    }
}
