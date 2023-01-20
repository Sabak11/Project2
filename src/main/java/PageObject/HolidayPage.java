package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HolidayPage {

    public SelenideElement

            minPrice = $(By.xpath("(//input[@id='minprice'])[2]")),
            maxPrice = $(By.xpath("(//input[@id='maxprice'])[2]")),

            holidayIconHover = $(By.xpath("//label[contains(text(),'დასვენება')]")),

            bakurianiClick = $(By.xpath("//a[contains(text(),'ბაკურიანი')]")),

            scrollUp = $(By.xpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]")),

            VaucherPriceScroll = $(byXpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]")),

            searchButton = $(By.cssSelector("div[class='category-filter-desk'] div[class='submit-button']"));


    public ElementsCollection VaucherPrice = $$(byXpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]"));




}
