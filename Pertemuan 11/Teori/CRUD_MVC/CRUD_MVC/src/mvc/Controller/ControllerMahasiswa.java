/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.sql.SQLException;
import mvc.View.FormMahasiswa;
import mvc.DAO.DAOMahasiswa;
import mvc.DAOInterface.IMahasiswa;
import mvc.Model.Mahasiswa;
import mvc.Model.TabelModelMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS PC
 */
public class ControllerMahasiswa {
    FormMahasiswa frame;
    IMahasiswa implMahasiswa;
    List<Mahasiswa> lb;

    public ControllerMahasiswa(FormMahasiswa frame) throws SQLException {
        this.frame = frame;
        implMahasiswa = new DAOMahasiswa();
        lb = implMahasiswa.getAll();
    }

    public void isiTable() {
        lb = implMahasiswa.getAll();
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
//        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row){
        frame.getTxtID().setEditable(false);
        String s=String.valueOf(lb.get(row).getId());
//        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtNim().setText(lb.get(row).getNim());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }

    public void insert() {
        if (!frame.getTxtNim().getText().trim().isEmpty()& !frame.getTxtNama().getText().trim().isEmpty()){
            Mahasiswa a = new Mahasiswa();
            a.setNim(frame.getTxtNim().getText());
            a.setNama(frame.getTxtNama().getText());
            a.setJk(frame.getTxtJk().getSelectedItem().toString());
            a.setAlamat(frame.getTxtAlamat().getText());
            implMahasiswa.insert(a);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }

    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtNim().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }

    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            implMahasiswa.delete(id);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }

    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            Mahasiswa a = new Mahasiswa();
            a.setNim(frame.getTxtNim().getText());
            a.setNama(frame.getTxtNama().getText());
            a.setJk(frame.getTxtJk().getSelectedItem().toString());
            a.setAlamat(frame.getTxtAlamat().getText());
            a.setId(Integer.parseInt(frame.getTxtID().getText()));
            implMahasiswa.update(a);
            JOptionPane.showMessageDialog(null, "simpan data sukses");
        } else{
            JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong");
        }
    }

    public void carinama() {
        if (!frame.getTxtCariNama().getText().trim().isEmpty()) {
            implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
            isiTabelCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
    
    public void isiTabelCariNama(){
        lb = implMahasiswa.getCariNama(frame.getTxtCariNama().getText());
        TabelModelMahasiswa tmb = new TabelModelMahasiswa(lb);
        frame.getTabelData().setModel(tmb);
        
    }

    
}
