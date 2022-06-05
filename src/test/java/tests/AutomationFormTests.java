package tests;

import org.junit.jupiter.api.Test;


public class AutomationFormTests extends TestBase {


    @Test
    void successfulTest() {

        registrationFormPage.openPage()
                .setFirstName(testData.name)
                .setLastName(testData.lastname)
                .setUserEmail(testData.email)
                .setGender(testData.gender)
                .userNumber(testData.number)
                .setDateofBirth(testData.month, testData.year, testData.day)
                .setHobby(testData.hobby)
                .setSubject(testData.subject)
                .setPicture("test.png")
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .pressSubmit()
                .checkResult("Student Name", testData.name + " " + testData.lastname)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.number)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.picture)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);


    }
}