/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package kasirjualbeli;

/**
 *
 * @author ASUS PC
 */
public class Departemen {
    public String nama;
    public String alamat;
    public String noTelepon;
    
    public Departemen(){
    }
    public Departemen(String name, String Alamat, String noTelp){
        nama = name;
        alamat = Alamat;
        noTelepon = noTelp;
    }
    public void setNama(String name){
        nama = name;
        System.out.println("Nama : "+ nama);
    }
    public void setAlamat(String Alamat){
        alamat = Alamat;
        System.out.println("Alamat : "+ alamat);
    }
    public void setnoTelepon(String noTelp){
        noTelepon = noTelp;
        System.out.println("Nomor Telepon : "+ noTelepon);
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getnoTelepon(){
        return noTelepon;
    }
    public void Pembukaan(){
        System.out.println("===========Selamat Datang============");
    }

}
