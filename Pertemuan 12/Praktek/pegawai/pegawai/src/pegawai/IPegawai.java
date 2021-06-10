/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;

import java.util.List;
/**
 *
 * @author ASUS PC
 */
public interface IPegawai {
    public void insert(Pegawai b);
    public void update(Pegawai b);
    public void delete(int id);
    public List<Pegawai> getAll();
    public List<Pegawai> getCariNama(String nama);
}
