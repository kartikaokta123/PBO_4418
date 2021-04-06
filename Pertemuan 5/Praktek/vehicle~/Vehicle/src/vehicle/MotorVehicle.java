/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;

/**
 *
 * @author ASUS PC
 */
public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";
    
    MotorVehicle(){
        
    }
    MotorVehicle(int sizeEng, String lcPlate){
        sizeofEngine = sizeEng;
        licencePlate = lcPlate;
    }
    int getSizeofEnging(){
        return sizeofEngine;
    }
    String getLicencePlate(){
        return licencePlate;
    }
    
    
}
