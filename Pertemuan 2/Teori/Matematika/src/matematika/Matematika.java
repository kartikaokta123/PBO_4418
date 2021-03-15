/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package matematika;

public class Matematika {
    int angka1;
    int angka2;
    
    Matematika(){
        
    }
    
    Matematika(int angka_1, int angka_2){
        angka1 = angka_1;
        angka2 = angka_2;
    }
    
    int perTambahan(){
        return angka1 + angka2;
    }
    
    int pengKurangan(){
        return angka1 - angka2;
    }
    
    int perKalian(){
        return angka1 * angka2;
    }
    
    int pemBagian(){
        return angka1 / angka2;
    }
}
