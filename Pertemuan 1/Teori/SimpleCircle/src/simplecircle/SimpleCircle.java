/* Kartika Okta Rachmawati
 * A11.2019.12197
 * 4418
 */
package simplecircle;

public class SimpleCircle {
    double radius = 1;
    
    SimpleCircle() {

    }
   
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
    
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
