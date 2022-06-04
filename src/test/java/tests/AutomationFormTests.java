package tests;

import org.junit.jupiter.api.Test;


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