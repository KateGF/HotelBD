
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesControl;

import HotelesModel.Location.Country;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author guzka
 */
public class CountryController {

    DBController database;

    public CountryController() {

        database = new DBController();
    }



    public ArrayList<Country> GetAllCountries() throws SQLException, ClassNotFoundException {

        Country Country = null;
        ArrayList<Country> list = new ArrayList<Country>();
        
        try {
            // Create connection
            Connection conn = database.DBConnection();
            if(conn!=null){
            // Make the query 
            String query = "Exec getAlllCountries()";

            // Statement for execute the query
            Statement stmt = conn.createStatement();

            // Executing the query  + Getting the result
            ResultSet rs = stmt.executeQuery(query);

            // Each Row 
            while (rs.next()) {

                // Bring the information to create an Country
                String name = rs.getString("name");
               
                // Create Country
                Country = new HotelesModel.Location.Country(name);
                list.add(Country);

            }
            conn.close();
            }
            return list;
           

        } catch (SQLException e) {
            return null;
        }

    }
    
    
    
    public void createCountry(Country Country) throws SQLException, ClassNotFoundException {

        try {
            // Create connection
            Connection conn = database.DBConnection();
            if(conn!=null){
            // Make the query 
                   // Bring the information to create an Country
                String name = Country.getName();
            
            
            String query = "Exec Man_Country(" + name  + ")";   
            
          
            // Statement for execute the query
            Statement stmt = conn.createStatement();

            // Executing the query  + insert
            
            ResultSet rs = stmt.executeQuery(query);

            
            conn.close();
            }  

        } catch (SQLException e) {

        }

    }
    
    
}