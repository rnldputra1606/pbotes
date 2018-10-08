package biodata;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class UserTableModel extends DefaultTableModel {

    List<User> pengguna;
    static String header[] = {"NIM", "Nama", "fakultas", "Program Studi", "Angkatan"};

    public UserTableModel(Object data[][], Object kolom[]) {
        super(data, kolom);
        pengguna = new ArrayList<User>();
    }

    public Class getColumnClass(int col) {
        Vector v = (Vector) dataVector.elementAt(0);
        return v.elementAt(col).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }

}
