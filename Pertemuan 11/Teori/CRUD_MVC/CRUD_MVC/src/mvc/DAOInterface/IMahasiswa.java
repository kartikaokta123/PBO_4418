/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.Mahasiswa;
/**
 *
 * @author ASUS PC
 */
public interface IMahasiswa {
    public void insert(Mahasiswa a);
    public void update(Mahasiswa a);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}
