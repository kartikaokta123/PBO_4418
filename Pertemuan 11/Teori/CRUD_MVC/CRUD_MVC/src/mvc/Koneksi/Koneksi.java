/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package mvc.Koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ASUS PC
 */
public class Koneksi {
    static Connection connect;
    
    public static Connection connection() throws SQLException{
        if (connect == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_crud");
            data.setUser("root");
            data.setPassword("");
            try{
                connect = data.getConnection();
            } catch (SQLException ex){
                System.out.println("Gagal");
            }
        }
        return connect;
    }
    
}
