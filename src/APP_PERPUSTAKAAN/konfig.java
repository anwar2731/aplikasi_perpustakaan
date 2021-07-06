/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_PERPUSTAKAAN;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konfig {
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
       try {
           String url="jdbc:mysql://localhost:3306/pa_pbo";//url database
           String user="root"; //user database
           String pass="";
           
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           MySQLConfig=(Connection) DriverManager.getConnection(url, user , pass);
           
       } 
       catch (SQLException e){
           System.out.println("koneksi gagal "+e.getMessage());// perintah menampilkan perintah eror pada koneksi
       }
       return MySQLConfig;
    }
}
