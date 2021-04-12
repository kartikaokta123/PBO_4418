/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;


public class Car extends MotorVehicle{
    private boolean seatBelt = false;
    
    public Car(){
        
    }
    public void setSeatBelt(int seatbelt){
        seatBelt = true;
    }
    public boolean getSeatBelt(){
        return seatBelt;
    }
}
