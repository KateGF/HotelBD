/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesControl;

import HotelesModel.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guzka
 */
public class UserController {

    DBController database;

    public UserController() {

        database = new DBController();
    }

    public String Login(String username, String password) throws ClassNotFoundException  {
        // 1. verify errors
        // 1.1 empty spaces
        if ((username.isEmpty() || (password.isEmpty()))) {
            return "Username or password cannot be empty";
        } else {
            try {
                // verify password(traer de la base de datos ese usuario)
                // bring the user from DB
                User GetUserbyUsername = GetUserbyUsername(username);
                if (GetUserbyUsername != null) {
                    if (password.equals(GetUserbyUsername.getPassword())) {
                        return "Usuario Logueado";
                    } else {
                        return "Password Incorrect";
                    }
                } else {
                    return "Usuario NO Encontrado";
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
                return "Error Base Datos";
            }
        }
    }

    public User GetUserbyUsername(String username) throws SQLException, ClassNotFoundException {

        User user = null;
        try {
            // Create connection
            Connection conn = database.DBConnection();
            if(conn!=null){
            // Make the query 
            //String query = "Execute getUser(" + username + ")";
String query = "select * from users where username = '"+ username + "'";
            // Statement for execute the query
            Statement stmt = conn.createStatement();

            // Executing the query  + Getting the result
            ResultSet rs = stmt.executeQuery(query);

            // Each Row 
            while (rs.next()) {

                // Bring the information to create an User
                String name = rs.getString("firstName");
                String password = rs.getString("password");

                // Create User
                user = new HotelesModel.User(name, username, password);

            }
            conn.close();
            }
            return user;
           

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

    }
    
    public void Register(User user){
        // verify that text entry are not empty
    }
    
    
    public void createUser(User user) throws SQLException, ClassNotFoundException {

        try {
            // Create connection
            Connection conn = database.DBConnection();
            if(conn!=null){
            // Make the query 
                   // Bring the information to create an User
                String password = user.getPassword();
                String photo = user.getPhoto();
                String identificationCard = user.getIdentificationCard();
                String firstName = user.getFirstName();
                String lastName = user.getLastName();
                String secondSurname = user.getSecondSurname();
                String middleName = user.getMiddleName();
                String username = user.getUsername();
                Date birthdate = user.getBirthdate();
                String gender = user.getGender();
                String phoneNumber = user.getPhoneNumber();
                String nationality = user.getNationality();
                String country = user.getCountry();
                String state = user.getState();
                String canton = user.getCanton();
                String district = user.getDistrict();
                int idUserType = user.getIdUserType();
                int idHotelAdmin = user.getIdHotelAdmin();
            
            
            String query = "Exec Man_user(" + photo + ", " + identificationCard + ", " + firstName + ", " + middleName + ", " + lastName + ", " + username + ", " + password + ", " + birthdate + ")";   
            
          
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
