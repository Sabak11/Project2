package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BakurianiPage {

    public SelenideElement

            categoryBakuriani = $(By.xpath("//div[@class='category-filter-desk']//a[contains(text(),'ბაკურიანი')]")),

            getCategoryBakurianiColor = $(By.xpath("//div[@class='category-filter-desk']//a[contains(text(),'ბაკურიანი')]")),

            locationBakuriani = $(By.xpath("//div[@class='category-filter-desk']//label[contains(text(),'ბაკურიანი')]")),
            sort = $(By.id("sort")),
            sortLowPrice = $(By.xpath("//option[contains(text(),'ფასით კლებადი')]"));


    public ElementsCollection selectCards  = $$(byXpath("//div[@class='special-offer']//div[@class='discounted-prices']//p[1]"));


}
