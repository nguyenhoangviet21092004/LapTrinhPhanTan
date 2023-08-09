package baitap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
   private String hostName = "localhost:3306";
   private String dbName = "Product_Manager";
   private String userName = "root";
   private String password = "l";

   private String URL = "jdbc:mysql://" + hostName +"/"+dbName;



   public Connection connection (){
       Connection connection = null;
       try{
        connection = DriverManager.getConnection(URL,userName,password);
           System.out.println("Connected !");
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
       return connection;
   }

    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        connectJDBC.connection();
    }
}
