/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package mobil2;

public class Mobil2 {
    String warna;
    int tahunProduction;
    int gigi;
    boolean on = false;
            
    Mobil2(){
        gigi = 1;
    }
    
   public void hidupkanMobil() {
       on = true;
   }
   
   public void matikanMobil() {
       on = false;
   }

   public void setGigi(int newGigi) {
    gigi = newGigi;
   }
   
   public void gigiUp() {
       gigi = ++gigi;
   }
   
   public void gigiDown() {
       gigi = --gigi;
   }
}
