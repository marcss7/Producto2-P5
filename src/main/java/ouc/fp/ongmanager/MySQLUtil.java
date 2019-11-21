package ouc.fp.ongmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLUtil {

    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/ong_db?&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";
    private static final String MAX_POOL = "250";

    private Connection connection;
    private Properties properties;

    // Crea las propiedades
    private Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }

    // Conecta la base de datos
    public Connection connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, getProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Desconecta la base de datos
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
