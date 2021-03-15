/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package buku;

public class BukuDemo {
    public static void main(String[] args){
        Buku buku1 = new Buku();
        buku1.setJudul("Pemprograman Berbasis Objek dengan java");
        buku1.setPengarang("Indrajani");
        buku1.setPenerbit("Elexmedia Komputation");
        buku1.setTahun(2007);
        
        Buku buku2 = new Buku();
        buku2.setJudul("Dasar Pemrograman Java");
        buku2.setPengarang("Abdul Kadir");
        buku2.setPenerbit("Andi Offset");
        buku2.setTahun(2004);
        
        buku1.cetakBuku();
        buku2.cetakBuku();
    }
}
