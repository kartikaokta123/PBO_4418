/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;

/**
 *
 * @author ASUS PC
 */
public class Pegawai {

    private int id;
    private String nik;
    private String nama;
    private String jk;
    private String alamat;
    private int usia;
    private String alasan;
    
    public String getNik() {
        return nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    public String getAlasan() {
        return alasan;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
}
