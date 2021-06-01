/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package mvc.DAO;

import mvc.Model.Mahasiswa;
import mvc.Koneksi.Koneksi;
import mvc.DAOInterface.IMahasiswa;
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
public class DAOMahasiswa implements IMahasiswa{
    Connection connection;
    final String insert = "INSERT INTO tblmahasiswa (nim, nama, jk, alamat) VALUES (?, ?,?, ?);";
    final String update = "UPDATE tblmahasiswa set nim=?, nama=?, jk=?, alamat=? where id=?;";
    final String delete = "DELETE FROM tblmahasiswa where id=?;";
    final String select = "SELECT * FROM tblmahasiswa;";
    final String carinama = "SELECT * FROM tblmahasiswa where nama like ?;";
    
    public DAOMahasiswa() throws SQLException{
        connection = Koneksi.connection();
    }
    @Override
    public void update(Mahasiswa a) {
        PreparedStatement kondisi = null;
        try {
            kondisi = connection.prepareStatement(update);
            kondisi.setString(1, a.getNim());
            kondisi.setString(2, a.getNama());
            kondisi.setString(3, a.getJk());
            kondisi.setString(4, a.getAlamat());
            kondisi.setInt(5, a.getId());
            kondisi.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                kondisi.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            } 
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement kondisi = null;
        try {
            kondisi = connection.prepareStatement(delete);
            kondisi.executeUpdate();
            
            kondisi.setInt(1, id);
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                kondisi.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            Statement s = connection.createStatement();
            ResultSet b = s.executeQuery(select);
            while (b.next()) {
                Mahasiswa a = new Mahasiswa();
                a.setId(b.getInt("id"));
                a.setNim(b.getString("nim"));
                a.setNama(b.getString("nama"));
                a.setJk(b.getString("jk"));
                a.setAlamat(b.getString("alamat"));
                lb.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    @Override
    public List<Mahasiswa> getCariNama(String nama) {
        List<Mahasiswa> lb = null;
        try {
            lb = new ArrayList<Mahasiswa>();
            PreparedStatement s = connection.prepareStatement(carinama);
            s.setString(1, "%" + nama + "%");
            ResultSet b = s.executeQuery();
            while (b.next()) {
                Mahasiswa a = new Mahasiswa();
                a.setId(b.getInt("id"));
                a.setNim(b.getString("nim"));
                a.setNama(b.getString("nama"));
                a.setJk(b.getString("jk"));
                a.setAlamat(b.getString("alamat"));
                lb.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
            
    @Override
    public void insert(Mahasiswa a) {
        PreparedStatement kondisi = null;
        try {
            kondisi = connection.prepareStatement(insert);
            kondisi.setString(1, a.getNim());
            kondisi.setString(2, a.getNama());
            kondisi.setString(3, a.getJk());
            kondisi.setString(4, a.getAlamat());
            kondisi.executeUpdate();
            ResultSet b = kondisi.getGeneratedKeys();
            while (b.next()) {
                a.setId(b.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                kondisi.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            } 
        }
    }
    
}
