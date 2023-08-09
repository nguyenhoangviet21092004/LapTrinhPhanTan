import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connection();

        String query = "INSERT INTO users(id,username,password,email)" + "values(?,?,?,?)";

        PreparedStatement preparedStatement = null ;
        try{
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"nguyen hoang viet ");
            preparedStatement.setString(3,"2 ");
            preparedStatement.setString(4,"nguyenhoangviet@gmail.com ");

            int row = preparedStatement.executeUpdate();
            if (row!=0) {
                System.out.println("Update complete " + row);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
