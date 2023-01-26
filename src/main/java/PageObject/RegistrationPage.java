package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {


    public SelenideElement

            clickRegistrationBtn = $(By.xpath("//div[@class='swoop-login']//label")),
            clickRegistrationButtonInside = $(By.xpath("//p[@class='register']")),
            fillName = $(By.id("pFirstName")),
            fillLastName = $(By.id("pLastName")),
            fillEmail = $(By.id("pEmail")),
            fillPhone = $(By.id("pPhone")),
            fillBirthDate = $(By.id("pDateBirth")),
            fillPassword = $(By.id("pPassword")),
            fillConfirmPassword = $(By.id("pConfirmPassword")),
            cliclRegButton = $(By.className("dashbord-registration")),
            genderVerifyMessage = $(By.xpath("//p[@id='physicalInfoMassage']"));


}
