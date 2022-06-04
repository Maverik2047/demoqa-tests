package tests;

import org.junit.jupiter.api.Test;
import pages.components.PictureUpload;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AutomationFormTests extends TestBase {


    @Test
    void successfulTest() {

        registrationFormPage.openPage()
                .setFirstName(testData.name)
                .setLastName(testData.lname)
                .setUserEmail(testData.email)
                .setGender(testData.gender)
                .userNumber(testData.number)
                .setDateofBirth(testData.month, testData.year)
                .setHobby(testData.hobby)
                .setSubject(testData.subject)
                .setPicture()
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .pressSubmit()
                .checkResults();


    }
}