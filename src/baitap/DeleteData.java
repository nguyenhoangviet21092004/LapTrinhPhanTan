package baitap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection =   connectJDBC.connection();
        String query = "delete from product where id = ?";

        PreparedStatement preparedStatement= null;
        try{
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,2);
            int row = preparedStatement.executeUpdate();
            if (row!=0) {
                System.out.println("complete");
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
