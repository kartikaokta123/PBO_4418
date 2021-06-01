/*
Kartika Okta Rachmawati
A11.2019.12197
4418
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS PC
 */
public class TabelModelMahasiswa extends AbstractTableModel {
    List<Mahasiswa> lb;

    public TabelModelMahasiswa(List<Mahasiswa> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }

    

    
    public String getColumnNama(int column){
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NIM";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";    
            default :
                return null;
        } 
    }
    
    public Object getValueAt(int column, int row){
        switch (column){
            case 0 :
                return lb.get(row).getId();
            case 1 :
                return lb.get(row).getNim();
            case 2 :
                return lb.get(row).getNama();
            case 3 :
                return lb.get(row).getJk();
            case 4 :
                return lb.get(row).getAlamat();
            default :
                return null;    
        }
    }
}
