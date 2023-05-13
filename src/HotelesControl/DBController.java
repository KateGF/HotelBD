/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelesControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guzka
 */
public class DBController {

    public Connection DBConnection() throws ClassNotFoundException {

        try {
            String url = "jdbc:oracle:thin:@localhost:1524:ort";
          //  Class.forName("oracle.jdbc.OracleDriver");
            
            Connection conn = DriverManager.getConnection(url,"katy","1234");
         
           // DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // Para el método getConnection del driver debe colocar el url la base de datos a la que se desea conectar,
            // el nombre del esquema que desea utilizar y la contraseña de dicho esquema.
            return conn;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
