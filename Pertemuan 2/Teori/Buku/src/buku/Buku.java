/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package buku;

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
  
//    public void Buku(String judul, String pengarang, String penerbit, int tahun){
//       this.judul = judul;
//       this.pengarang = pengarang;
//       this.penerbit = penerbit;
//       this.tahun = tahun;
//    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public int getTahun(){
        return tahun;
    }
        
//    public void cetakBuku(){
//        System.out.println("judul: " + buku.getJudul);
//        System.out.println("pengarang: " + this.pengarang);
//        System.out.println("penerbit: " + this.penerbit);
//        System.out.println("tahun: " + this.tahun);
//    }   
    public void cetakBuku(){
        System.out.println(judul+", "+pengarang+", "+penerbit+", "+tahun);
    }
}
