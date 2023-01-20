package StepObject;

import PageObject.HolidayPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import java.time.Duration;
import static DataObject.Data.maxPriceData;
import static DataObject.Data.minPriceData;
import static com.codeborne.selenide.Selenide.sleep;

public class HolidayPageSteps extends HolidayPage {

    @Step("fill form min price")

    public HolidayPageSteps minPrice(String minPriceValue) {
        minPrice.sendKeys(minPriceValue);
        return this;
    }




    @Step("fill form max price")

    public HolidayPageSteps maxPrice(String maxPriceValue) {
        maxPrice.sendKeys(maxPriceValue);
        return this;
    }

    @Step("click on the search button ")
    public HolidayPageSteps searchButtonClick() {
        searchButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        VaucherPriceScroll.scrollIntoView(true);
        scrollUp.scrollIntoView(false);
        return this;
    }




    @Step("Check All item Price")
    public HolidayPageSteps PriceCheck() {

        for (int i = 0; i < VaucherPrice.size(); i++) {
            String s = VaucherPrice.get(i).getText().replace("₾", "");
            boolean check = Float.parseFloat(s) >= Integer.parseInt(minPriceData) && Float.parseFloat(s) <= Integer.parseInt(maxPriceData);

            Assert.assertTrue(check);
        }
        return this;
    }



    @Step("hover holiday icon ")
    public HolidayPageSteps HolidayIconHover1() {
        holidayIconHover.hover();
        return this;
    }


    @Step("click on the bakuriani ")
    public HolidayPageSteps bakurianiClickStep() {
        bakurianiClick.click();
        return this;
    }


 }
















