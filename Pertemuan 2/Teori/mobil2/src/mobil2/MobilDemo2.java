/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package mobil2;

public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 mobilku = new Mobil2();
        mobilku.hidupkanMobil();
        mobilku.warna = "Hitam";
        mobilku.tahunProduction = 2006;
        mobilku.setGigi(3);
        mobilku.gigiDown();        
        
        System.out.println("Warna = " + mobilku.warna);  
        System.out.println("Tahun Production = " + mobilku.tahunProduction); 
        System.out.println("Gigi = " + mobilku.gigi); 
    }  
    
        
}
