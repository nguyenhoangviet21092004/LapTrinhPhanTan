package baitap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection =   connectJDBC.connection();
        String query = "update product set name = ? where id = ?  ";

        PreparedStatement preparedStatement = null;

        try{
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,"iphone 13 black");
            preparedStatement.setInt(2,2);

            int row = preparedStatement.executeUpdate();
            if (row!=0){
                System.out.println("complete");
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
