/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;

/**
 *
 * @author ASUS PC
 */
import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS PC
 */
public class DAOPegawai implements IPegawai{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (nik, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nik=?, nama=?, jk=?, alamat=?, usia=?, alasan=? where id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like ?;";
    
    public DAOPegawai(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(Pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            } 
        }
    }
    @Override
    public void update(Pegawai b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.setInt(7, b.getId());
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            } 
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.executeUpdate();
            
            statement.setInt(1, id);
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<Pegawai> getAll() {
        List<Pegawai> lb = null;
        try {
            lb = new ArrayList<Pegawai>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Pegawai b = new Pegawai();
                b.setId(rs.getInt("id"));
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public List<Pegawai> getCariNama(String nama) {
        List<Pegawai> lb = null;
        try {
            lb = new ArrayList<Pegawai>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pegawai b = new Pegawai();
                b.setId(rs.getInt("id"));
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
            
    
    
}

 
