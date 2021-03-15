/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package television2;

public class Manusia {
    private String nama;
    private boolean punyaTV = false;
    
    public Manusia(){
        
    }
    public Manusia(String setNama){
        nama = setNama;
    }
    public String namaSaya(){
        return nama;
    }
    public void beliTV(Television2 tiviku){
        punyaTV = true;
    }
    public void jualSemuaTV(){
        punyaTV = false;
    }
    public boolean cekTV(){
        return punyaTV;
    }
}
