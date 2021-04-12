/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;

/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";
    
    public MotorVehicle(){
        
    }
    public MotorVehicle(int sizeEng, String lcPlate){
        sizeofEngine = sizeEng;
        licencePlate = lcPlate;
    }
    public int getSizeofEnging(){
        return sizeofEngine;
    }
    public String getLicencePlate(){
        return licencePlate;
    }
    
    
}
