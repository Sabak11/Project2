package StepObject;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class OpenBrowser {

    @Step("Open browser")
    public OpenBrowser OPENBROWSER() {
        Configuration.timeout = 4000;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://swoop.ge/");
        return this;
    }

}



