package baitap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection =   connectJDBC.connection();

        String query = "insert into product (name,price,detail,mannufacturer,number,status)" + "values (?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;

        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"iphone 15 pink");
            preparedStatement.setDouble(2,1000000);
            preparedStatement.setString(3,"hang limited");
            preparedStatement.setString(4,"apple");
            preparedStatement.setInt(5,10);
            preparedStatement.setBoolean(6,true);

            int row = preparedStatement.executeUpdate();
            if (row!=0){
                System.out.println("complete " + row);
            }
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
