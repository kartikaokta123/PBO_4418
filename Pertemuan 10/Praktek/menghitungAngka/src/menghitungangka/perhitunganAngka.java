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
import java.awt.event.*;
public class perhitunganAngka extends javax.swing.JFrame implements ActionListener{
  TextField number01, number02, Hasil;
  Button perTambahan, peNgurangan;  

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomor01 = number01.getText();
        String nomor02 = number02.getText();
        int x = Integer.parseInt(nomor01);
        int y = Integer.parseInt(nomor02);
        int z = 0;
        
        if (e.getSource()==perTambahan){
            z = x + y;
        }else if (e.getSource()==peNgurangan){
            z = x - y;
        }
        
        String result = String.valueOf(z);
        Hasil.setText(result);
    }
    perhitunganAngka(){
        number01 = new TextField();
        number01.setBounds(50, 50, 150, 20);
        number02 = new TextField();
        number02.setBounds(50, 100, 150, 20);
        Hasil = new TextField();
        Hasil.setBounds(50, 150, 150, 20);
        Hasil.setEditable(false);
        perTambahan = new Button("+");
        perTambahan.setBounds(50, 200, 50, 50);
        peNgurangan = new Button("-");
        peNgurangan.setBounds(120, 200, 50, 50);
        perTambahan.addActionListener(this);
        peNgurangan.addActionListener(this);
        add(number01);
        add(number02);
        add(Hasil);
        add(perTambahan);
        add(peNgurangan);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) {
        new perhitunganAngka();
    }
   
}
