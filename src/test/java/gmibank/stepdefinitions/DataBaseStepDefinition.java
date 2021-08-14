package gmibank.stepdefinitions;

import gmibank.utilities.DataBaseUtility;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DataBaseStepDefinition {
    @Given("user connet database and print all data")
    public void user_connet_database_and_print_all_data() throws SQLException {
        DataBaseUtility.createConnection();


}

}
