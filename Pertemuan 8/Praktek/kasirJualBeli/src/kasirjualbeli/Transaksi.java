/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package kasirjualbeli;

/**
 *
 * @author ASUS PC
 */
public class Transaksi {
    int noTransaksi;
    int jumlahProduk;
    int hargaProduk;
    int totalHarga;
    int bonusKaryawan;
    
    public Transaksi(){
        
    }
    public Transaksi(int noTrans, int jmlProduct, int Price, int totalPrice, int BonusPegawai){
        noTransaksi = noTrans;
        jumlahProduk = jmlProduct;
        hargaProduk = Price;
        totalHarga = totalPrice;
        bonusKaryawan = BonusPegawai;
    }
    public void setNoTransaksi(int noTrans){
        noTransaksi = noTrans;
    }
    public int getNoTransaksi(){
        return noTransaksi;
    }
    public void HargaProduct(int Price){
        hargaProduk = Price;
    }
    public int getHargaProduct(){
        return hargaProduk;
    }
    public void jmlProduk(int jmlProduct){
        jumlahProduk = jmlProduct;
    }
    public int getjmlProduk(){
        return jumlahProduk;
    }
    public void totalPrice(){
        totalHarga = jumlahProduk * hargaProduk;
        System.out.println("Total Harga : " + totalHarga);
    }
    public void BonusPegawai(){
        bonusKaryawan = totalHarga / 10 ;
        System.out.println("Bonus Penjualan : " + bonusKaryawan);     
    }
}
