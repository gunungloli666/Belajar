package matakuliah;

import java.io.File;
import java.io.IOException;
import string.MataKuliah;

/**
 * Class ini dipanggil dari class Main frame, di mana gunanya untuk menginialisasi
 * mata kuliah yang akan ditampilkan pada frame
 * @author mrs_sweet
 */

public class ReadFile {

    private BacaMataKuliah[] baca ;
    private int jmlMataKuliah = 0;
    String[] str;
     File f;

    public ReadFile() throws IOException , NullPointerException {
        f = new File("./mk");
        str = f.list();
        jmlMataKuliah = str.length; // sesuatu Yang membuat error
        baca = new BacaMataKuliah[jmlMataKuliah];
        for (int i = 0; i < baca.length; i++) {
            baca[i] = new BacaMataKuliah("./mk", str[i]);
        }
    }

    public int getJumlahMataKuliah(){
        return jmlMataKuliah;
    }

    public String[] getListFile(){
        return str;
    }

    public BacaMataKuliah[] getMataKuliah(){
        return baca;
    }

    public MataKuliah[] getAllMataKuliah(){
        return baca;
    }
}
