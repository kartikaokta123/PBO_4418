/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;

public class Vehicle {
    double speed = 0;
    String color = "orange";
    
    public Vehicle(){
        
    }
    public void goStraight(){
        System.out.println("Maju...");
    }
    public void turnLeft(){
        System.out.println("Belok kiri");
    }
    public void turnRight(){
        System.out.println("Belok kanan");
    }
    
}
