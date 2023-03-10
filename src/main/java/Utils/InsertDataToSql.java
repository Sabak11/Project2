package Utils;

import DataObject.RegistrationData;
import org.testng.annotations.Test;

import java.sql.*;

public class InsertDataToSql implements RegistrationData {
    @Test
    public void InsertQuery() throws SQLException {
        Connection Conn = ConnectToSql.SqlConnection();


        String InsertDataQuery = "INSERT INTO [users].[dbo].[users] (firstname, lastname, phone, email, dateOfBirth, password)"
                + "values (?,?,?,?,?,?)";

        PreparedStatement prst = Conn.prepareStatement(InsertDataQuery);
        prst.setString(1,FirstNameValue);
        prst.setString(2,LastNameValue);
        prst.setString(3,PhoneNumberValue);
        prst.setString(4,EmailValue);
        prst.setString(5,BirthDateValue);
        prst.setString(6,PasswordValue);
        prst.executeUpdate();
        Conn.close();
    }
}





