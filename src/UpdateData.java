import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connection();

        String query = "update users set password = ? where id = ?" ;

        PreparedStatement preparedStatement = null ;

        try{
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1,"vietdz");
            preparedStatement.setInt(2,2);

            int row = preparedStatement.executeUpdate();

            if (row!=0) {
                System.out.println("complete " + row);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
