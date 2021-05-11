/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package kasirjualbeli;

import java.util.ArrayList;

/**
 *
 * @author ASUS PC
 */
public class Pembeli extends Departemen{
    ArrayList<String> pilih = new ArrayList<>();
    public ArrayList<String> pembeliIndividu  = new ArrayList<>();
    public ArrayList<String> pembeliBorongan  = new ArrayList<>();
    
    public Pembeli(){
        
    }
    public Pembeli(String name, String Alamat, String noTelpPembeli){
        nama = name;
        alamat = Alamat;
        noTelepon = noTelpPembeli;  
    }
    public void addPembeliIndividu(String name){
        pembeliIndividu.add(name);
    }
    public void getAllPembeliIndividu(){
        System.out.println("Pembelian Individu : " + pembeliIndividu);
    }
    public void addPembeliBorongan(String name){
        pembeliBorongan.add(name);
    }
    public void getAllPembeliBorongan(){
        System.out.println("Pembelian Borongan : " + pembeliBorongan);
    }
    public void Penjualan(){
        pilih.add("Individu");
        pilih.add("Borongan");
        System.out.println("Penjualan : " + pilih);
    }
    public void Pilihan(int index){
        System.out.println("pilih : " + pilih.get(index));
    }
}
