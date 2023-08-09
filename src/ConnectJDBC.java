import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "JDBCForJava";
    private String username = "root";
    private String password = "l";

    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connection(){
        Connection connection = null ;

        try {
            connection = DriverManager.getConnection(connectionURL,username,password);
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


