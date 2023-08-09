import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connection();
        String query = "delete from  users where id = ? ";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,2);


            int row = preparedStatement.executeUpdate();

            if (row!=0){
                System.out.println("complete" + row);
            }
            conn.close();
        } catch (SQLException e) {
            throw   new RuntimeException(e);
        }
    }
}
