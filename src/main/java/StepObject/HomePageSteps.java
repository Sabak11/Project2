package StepObject;

import PageObject.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps extends HomePage {

    @Step("click on the rest icon")

    public HomePageSteps HolidayIconClick() {
        holidayIcon.click();
        return this;
    }

}

