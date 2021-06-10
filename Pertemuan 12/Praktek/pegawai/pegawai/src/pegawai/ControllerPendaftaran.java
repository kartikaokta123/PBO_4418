/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerPendaftaran {
    pendaftaran frame;
    IPegawai implPegawai;
    List<Pegawai> lb;
    
    public ControllerPendaftaran(pendaftaran frame) {
        this.frame = frame;
        implPegawai = new DAOPegawai();
        lb = implPegawai.getAll();
    }
    
    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtNik().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtAlasan().setText("");
    }
    
    public void insert() {
        if (!frame.getTxtNik().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()){
            Pegawai b = new Pegawai();
            b.setNik(frame.getTxtNik().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            implPegawai.insert(b);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        }else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }
    
}
