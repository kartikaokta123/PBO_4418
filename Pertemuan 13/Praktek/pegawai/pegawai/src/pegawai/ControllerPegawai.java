/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;


import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS PC
 */
public class ControllerPegawai {
    panitia frame;
    IPegawai implPegawai;
    List<Pegawai> lb;

    public ControllerPegawai(panitia frame) {
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

    public void isiTable() {
        lb = implPegawai.getAll();
        TabelModelPegawai tmb = new TabelModelPegawai(lb);
//        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
        
    }
    
    public void isiField(int row){
        frame.getTxtID().setEditable(false);
        String s=String.valueOf(lb.get(row).getId());
//        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNik().setText(lb.get(row).getNik());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
//        frame.getTxtUsia().setText(lb.get(row).getUsia());
        frame.getTxtUsia().setEditable(false);
        String d=String.valueOf(lb.get(row).getUsia());
        frame.getTxtAlasan().setText(lb.get(row).getAlasan());
        
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

    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            Pegawai b = new Pegawai();
            b.setNik(frame.getTxtNik().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            implPegawai.update(b);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }

    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            implPegawai.delete(id);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }

    public void isiTabelCariNama(){
        lb = implPegawai.getCariNama(frame.getTxtCariNama().getText());
        TabelModelPegawai tmb = new TabelModelPegawai(lb);
        frame.getTabelData().setModel(tmb);
        
    }

    public void carinama() {
        if (!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implPegawai.getCariNama(frame.getTxtCariNama().getText());
            isiTabelCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
}
