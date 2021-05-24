/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package menghitungangka;

/**
 *
 * @author ASUS PC
 */
import java.awt.*;
public class textField {
    public static void main(String args[]) {
        Frame x = new Frame("Contoh TextField");
        TextField txt1, txt2;
        txt1 = new TextField("Selamat Datang di Javapoint");
        txt1.setBounds(50, 100, 200, 30);
        txt2 = new TextField("AWT Tutorial");
        txt2.setBounds(50, 150, 200, 30);
        x.add(txt1);
        x.add(txt2);
        x.setSize(400, 400);
        x.setLayout(null);
        x.setVisible(true);
    }  
}
