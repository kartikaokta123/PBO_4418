/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;

public class MotorCycle extends MotorVehicle {
   private int numGear = 0;
   
   public MotorCycle(){
       
   }
   public void setGearFoot(int setGear){
       setGear = numGear;
   }
   
   public int getGearFoot(){
       return numGear;
   }
}
