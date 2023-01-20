package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationPageSteps extends RegistrationPage {

    SoftAssert softAssert = new SoftAssert();


    @Step("Click on the login button")

    public RegistrationPageSteps ClickLoginButton() {
        clickRegistrationBtn.click();
        return this;
    }

    @Step("Click on the login button inside")

    public RegistrationPageSteps clickLoginButtonSecond() {
        clickRegistrationButtonInside.click();
        return this;
    }



    @Step("fill name registration modal")

    public RegistrationPageSteps fillFirstName(String firstNameValue) {
        fillName.sendKeys(firstNameValue);
        return this;
    }

    @Step("fill last name registration modal")

    public RegistrationPageSteps fillLastName(String lastNameValue) {
        fillLastName.sendKeys(lastNameValue);
        return this;
    }


    @Step("fill email address registration modal")

    public RegistrationPageSteps fillEmailAddress(String emailValue) {
        fillEmail.sendKeys(emailValue);
        return this;
    }

    @Step("fill phone number registration modal")

    public RegistrationPageSteps fillPhoneNumber(String phoneValue) {
        fillPhone.sendKeys(phoneValue);
        return this;
    }


    @Step("fill birthday registration modal")

    public RegistrationPageSteps fillBirthDay(String dateOfBirth) {
        fillBirthDate.sendKeys(dateOfBirth);
        return this;
    }


    @Step("fill first password registration modal")

    public RegistrationPageSteps fillPasswordField(String passwordValue) {
        fillPassword.sendKeys(passwordValue);
        return this;
    }

    @Step("fill confirm password registration modal")

    public RegistrationPageSteps fillPasswordFieldConf(String passwordConfValue) {
        fillConfirmPassword.sendKeys(passwordConfValue);
        return this;
    }


    @Step("Click on the registration button")

    public RegistrationPageSteps clickRegButtonValue( ) {
        cliclRegButton.click();
        return this;
    }



    @Step("Check that error message ‘გთხოვთ აირჩიოთ სქესი!’ is appear")

    public RegistrationPageSteps CheckGenderErrorMessage() {
        genderVerifyMessage.getValue();
        softAssert.assertEquals(genderVerifyMessage, "გთხოვთ აირჩიოთ სქესი!");
        softAssert.assertAll();
        return this;

    }

}

