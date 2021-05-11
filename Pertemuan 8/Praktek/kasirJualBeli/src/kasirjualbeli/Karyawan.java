/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package kasirjualbeli;

/**
 *
 * @author ASUS PC
 */
public class Karyawan extends Departemen{
    String kodeKaryawan;
    
    public Karyawan(){
        
    }
    public Karyawan(String name, String Alamat, String noTelp, String kodePegawai){
        nama = name;
        alamat = Alamat;
        noTelepon = noTelp;
        kodeKaryawan = kodePegawai;  
    }
    public void setKodeKaryawan(String kodePegawai){
        kodeKaryawan = kodePegawai;
    }
    public String getKodeKaryawan(){
        return kodeKaryawan;
    }
    
}
