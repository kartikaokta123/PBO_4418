/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author ASUS PC
 */
public class Koneksi {
    static Connection con;
    

    
    public static Connection connection(){
        if (con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("pegawai");
            data.setUser("root");
            data.setPassword("");
            try{
                con = data.getConnection();
            } catch (SQLException ex){
                System.out.println("Gagal");
            }
        }
        return con;
    }
}
