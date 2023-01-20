package StepObject;

import PageObject.BakurianiPage;
import io.qameta.allure.Step;
import org.openqa.selenium.support.Color;
import org.testng.Assert;



public class BakurianiPageSteps extends BakurianiPage {


    @Step("category check for bakuriani")
    public BakurianiPageSteps categoryBakurianiCheck() {
        Assert.assertEquals(categoryBakuriani.getText(), "ბაკურიანი");
        return this;
    }


    @Step("location check for bakuriani")
    public BakurianiPageSteps locationBakurianiCheck() {
        Assert.assertEquals(locationBakuriani.getText(), "ბაკურიანი");
        return this;
    }

    @Step("sortByLow")
    public BakurianiPageSteps lowPriceSort() {
        sort.click();
        sortLowPrice.click();
        return this;
    }


    @Step("check bakuriani text color")
    public BakurianiPageSteps checkTextColor() {
         Assert.assertEquals(Color.fromString(getCategoryBakurianiColor.getCssValue("color")).asHex(),"#6e7cfa");
        return this;
    }


    @Step("compare two card ")
    public BakurianiPageSteps twoCardCompare() {

        String firstCard = selectCards.get(0).getText().replace("₾", "");
        String secondCard = selectCards.get(1).getText().replace("₾", "");

        int age_to_int = Integer.parseInt(firstCard);
        int age_to_int1 = Integer.parseInt(secondCard);
        boolean CompareFirstAndSecond = age_to_int > age_to_int1;

        Assert.assertTrue(CompareFirstAndSecond);

        System.out.println(firstCard + " " + secondCard);

        return this;
    }

}




