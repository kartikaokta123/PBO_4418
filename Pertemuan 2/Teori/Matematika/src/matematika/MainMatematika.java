/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package matematika;

public class MainMatematika {
    public static void main(String[] args) {
        Matematika mat1 = new Matematika(20, 20);    
        System.out.println("Pertambahan : " + mat1.angka1 + " + " + mat1.angka2 + " = " + mat1.perTambahan());
        
        Matematika mat2 = new Matematika(10, 5);    
        System.out.println("Pengurangan : " + mat2.angka1 + " - " + mat2.angka2 + " = " + mat2.pengKurangan());
    
        Matematika mat3 = new Matematika(10, 20);    
        System.out.println("Perkalian : " + mat3.angka1 + " x " + mat3.angka2 + " = " + mat3.perKalian());
        
        Matematika mat4 = new Matematika(20, 2);    
        System.out.println("Pembagian : " + mat4.angka1 + " / " + mat4.angka2 + " = " + mat4.pemBagian());        
    }
}
