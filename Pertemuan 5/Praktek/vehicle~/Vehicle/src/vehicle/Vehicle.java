/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package vehicle;

/**
 *
 * @author ASUS PC
 */
public class Vehicle {
    double speed = 0;
    String color = "orange";
    
    Vehicle(){
        
    }
    void goStraight(){
        System.out.println("Maju...");
    }
    void turnLeft(){
        System.out.println("Belok kiri");
    }
    void turnRight(){
        System.out.println("Belok kanan");
    }
    
}
