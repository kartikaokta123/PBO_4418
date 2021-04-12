/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;


public class testDrive {
    public static void KendaraanMelaju(Vehicle kendaraan){
        kendaraan.goStraight();
    }
    
    public static void main(String[] args) {
        Vehicle yuk = new Vehicle();
        yuk.goStraight();
        yuk.turnLeft();
        KendaraanMelaju(yuk);
        
        Bicycle hem = new Bicycle();
        hem.ringBell();
        KendaraanMelaju(hem);
        
        MotorCycle motor = new MotorCycle();
        motor.setGearFoot(7);
    }
}
