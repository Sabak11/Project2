package Utils;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFromSql {


    public String firstname, lastname, phone, email, dateOfBirth, password;

    @Test
    public void SelectQuery() throws SQLException {

        Connection Conn = ConnectToSql.SqlConnection();

        Statement stmt = Conn.createStatement();

        String SelectQuery = "SELECT * FROM users";

        ResultSet resultSet = stmt.executeQuery(SelectQuery);
        while (resultSet.next()) {
            firstname = resultSet.getString("firstName");
            lastname = resultSet.getString("lastName");
            phone = resultSet.getString("phone");
            email = resultSet.getString("email");
            dateOfBirth = resultSet.getString("dateOfBirth");
            password = resultSet.getString("password");
        }
        Conn.close();
    }
}