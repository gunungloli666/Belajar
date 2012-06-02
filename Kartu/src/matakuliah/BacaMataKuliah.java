package matakuliah;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import string.MataKuliah;

/**
 * Membaca file mata kuliah dari file yang sudah di format
 * disengaj hanya menerima file dengan ekstensi .mk
 * @author mrs_sweet
 */

public class BacaMataKuliah implements MataKuliah {

    private BufferedReader br;
    private FileReader fileReader ;
    private String directory;
    private File file;
    private String[][] mataKuliah ;
    String rootDirectory;
    
    public BacaMataKuliah(String rootDirectory , String dir) throws IOException {
        directory = dir;
        this.rootDirectory = rootDirectory;
        file = new File(rootDirectory , directory);
        if(!file.canRead())
            throw new IOException("File tidak bisa dibuka");
        baca();
    }
    
    private void baca() throws  IOException {
        fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
        String hasil ;
        ArrayList arrayList = new ArrayList();
        while((hasil = br.readLine())!=null){
            arrayList.add(hasil);
        }
        mataKuliah = new String[arrayList.size()][3];
        for(int i =0 ; i< mataKuliah.length ; i++){
            String a = arrayList.get(i).toString();
            String[] b = a.split("\t");
            if(b.length!=3){
                throw new IOException("File mata kuliah tidak diformat dengan benar\n");
            }
            mataKuliah[i][0] = b[0];
            mataKuliah[i][1] = b[1];
            mataKuliah[i][2] = b[2];
        }
    }

    @Override
    public String[][] getMataKuliah(){
        return  mataKuliah;
    }

    @Override
    public String toString(){
       String fn = file.getName();
       int a = fn.lastIndexOf(".");
       fn = fn.substring( 0,a );
       return fn;
    }
    
}
