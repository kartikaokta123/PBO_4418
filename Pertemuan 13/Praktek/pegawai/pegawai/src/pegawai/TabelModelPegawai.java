/* Kartika Okta Rachmawati
 * A11.2019.12197
 * A11.4418
 */
package pegawai;

import java.util.List;

/**
 *
 * @author ASUS PC
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS PC
 */
public class TabelModelPegawai extends AbstractTableModel {
    List<Pegawai> lb;

    public TabelModelPegawai(List<Pegawai> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    

    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nik";
            case 2:
                return "Nama";
            case 3:
                return "Jenis Kelamin";
            case 4:
                return "Alamat";
            case 5:
                return "Usia";
            case 6:
                return "Alasan";
            default :
                return null;
        } 
    }
    
    public Object getValueAt(int row, int column){
        switch (column){
            case 0 :
                return lb.get(row).getId();
            case 1 :
                return lb.get(row).getNik();
            case 2 :
                return lb.get(row).getNama();
            case 3 :
                return lb.get(row).getJk();
            case 4 :
                return lb.get(row).getAlamat();
            case 5 :
                return lb.get(row).getUsia();
            case 6 :
                return lb.get(row).getAlasan();
            default :
                return null;    
        }
    }
}

