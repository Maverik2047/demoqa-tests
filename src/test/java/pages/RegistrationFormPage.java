package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;
import pages.components.PictureUpload;
import pages.components.ResultsComponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    PictureUpload pictureUpload = new PictureUpload();
    ResultsComponents resultsComponents = new ResultsComponents();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGenderInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userDateofBirth = $("#dateOfBirthInput"),
            userHobby = $("#hobbiesWrapper"),
            userSubject = $("#subjectsInput"),
            userAddress = $("#currentAddress"),
            userState = $("#state"),
            userCity = $("#city"),
            userSubmit = $("#submit");


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value) {
        userGenderInput.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage userNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setDateofBirth(String month, String year,String day) {
        userDateofBirth.click();
        calendarComponents.setDate(month, year,day);
        return this;
    }

    public RegistrationFormPage setHobby(String value) {
        userHobby.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setSubject(String value) {
        userSubject.sendKeys(value);
        userSubject.pressEnter();
        return this;
    }

    public RegistrationFormPage setAddress(String value) {
        userAddress.setValue(value);
        return this;
    }

    public RegistrationFormPage setState(String value) {
        userState.click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setCity(String value) {
        userCity.click();
        $(byText(value)).click();
        return this;
    }

    public RegistrationFormPage pressSubmit() {
        userSubmit.click();
        return this;
    }

    public RegistrationFormPage setPicture(String value) {
        pictureUpload.setPicture(value);
        return this;
    }
    public RegistrationFormPage checkResult(String key, String value){
        resultsComponents.checkResult(key,value);
        return this;
    }
}
