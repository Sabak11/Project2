package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement

            holidayIcon = $(By.xpath("//label[contains(text(),'დასვენება')]"));

}


