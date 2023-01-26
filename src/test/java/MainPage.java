
import StepObject.*;
import Utils.InsertDataToSql;
import Utils.Runner;
import Utils.SelectFromSql;
import Utils.SqlCreate;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;
import static DataObject.Data.*;



@Listeners(Utils.TestLister.class)

public class MainPage extends Runner {


    SqlCreate create = new SqlCreate();
    InsertDataToSql InsertData = new InsertDataToSql();
    SelectFromSql selectSql = new SelectFromSql();

    @BeforeClass
    public void GenerateData() throws SQLException {
        create.CreateDBAndTable();
        InsertData.InsertQuery();
        selectSql.SelectQuery();
    }



    HomePageSteps MainPageSteps = new HomePageSteps();
    HolidayPageSteps HolidayPageSteps = new HolidayPageSteps();
    BakurianiPageSteps BakurianiPageSteps = new BakurianiPageSteps();
    RegistrationPageSteps RegistrationPageSteps = new RegistrationPageSteps();
    OpenBrowser openBrowser = new OpenBrowser();



    @Test(groups = {"Regression1"})
    @Story("Price check")
    @Feature ("Added price filter for searching item in listing")
    @Description("Enter your min and max price")
    @Attachment(value="web page Screenshot",type="image/png")

    public void first(){

        openBrowser.OPENBROWSER();

        MainPageSteps.
                HolidayIconClick();

        HolidayPageSteps
                .minPrice(minPriceData)
                .maxPrice(maxPriceData)
                .searchButtonClick()
                .PriceCheck();
    }

    @Test(groups = {"Regression1"})
    @Story("Category Check")
    @Feature ("Category and text color ")
    @Description("Check some function: Category, Font color, Sort, Price compare ")
    @Attachment(value="web page Screenshot",type="image/png")


    public void second(){
        HolidayPageSteps
                .HolidayIconHover1()
                .bakurianiClickStep();

        BakurianiPageSteps
                .categoryBakurianiCheck()
                .locationBakurianiCheck()
                .checkTextColor()
                .lowPriceSort()
                .twoCardCompare();
    }


    @Test(groups = {"Regression2"})
    @Attachment(value="web page Screenshot",type="image/png")
    @Story("Register for new account ფიზიკური პირი")
    @Feature ("Date from Sql")
    @Description("Registration flow with test data")
    public void third(){

        RegistrationPageSteps
                .ClickLoginButton()
                .clickLoginButtonSecond()
                .fillFirstName(selectSql.firstname)
                .fillLastName(selectSql.lastname)
                .fillEmailAddress(selectSql.email)
                .fillPhoneNumber(selectSql.phone)
                .fillBirthDay(selectSql.dateOfBirth)
                .fillPasswordField(selectSql.password)
                .fillPasswordFieldConf(selectSql.password)
                .clickRegButtonValue()
                .CheckGenderErrorMessage();
    }

}
