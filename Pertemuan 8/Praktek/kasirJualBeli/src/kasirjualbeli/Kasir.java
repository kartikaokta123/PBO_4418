/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package kasirjualbeli;
/**
 *
 * @author ASUS PC
 */
import java.util.ArrayList;
public class Kasir {
    public static void Login(Departemen login){
        login.Pembukaan();
    }
    public static void main(String[] args) {
        Pembeli Dep = new Pembeli();
        Karyawan kar = new Karyawan();
        Transaksi bayar = new Transaksi();
        Bus bis = new Bus();
        
        Login(Dep);
        Dep.setNama("Anin");
        Dep.setAlamat("jalan Sari");
        Dep.setnoTelepon("085776654321");
        Dep.Penjualan();
        Dep.Pilihan(0);
        Dep.addPembeliIndividu("Anin");
        Dep.getAllPembeliIndividu();
        bis.namaProduk();
        bis.kodeProduk();
        bayar.jmlProduk(2);
        bayar.HargaProduct(200000000);
        bayar.totalPrice();

        
        kar.setNama("Ammar");
        kar.setKodeKaryawan("B2201");
        bayar.BonusPegawai();
        System.out.println("==============Thankyou==============");
 
    }
}
