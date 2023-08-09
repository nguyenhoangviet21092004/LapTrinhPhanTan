package baitap;

import java.sql.*;

public class ShowDataBase {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection =   connectJDBC.connection();
        String query = "select * from product ";

        Statement statement = null;

        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){



                System.out.println( resultSet.getInt("id") +"- "+   resultSet.getString("name")+ " -"+  resultSet.getDouble("price")+ "- "+  resultSet.getString("detail") + "- "+resultSet.getString("mannufacturer")+ "- "+ resultSet.getInt("number")+ "- "+ resultSet.getBoolean("status"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
