/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class ParticularElement {

    private MataKuliah matakuliah;
    private String[] sks , nama, kode;
    private String[][] mk;


    public ParticularElement(MataKuliah matakuliah){
        this.matakuliah = matakuliah;
        mk = matakuliah.getMataKuliah();
    }

    public String[] getSKS(){
        sks = new String[mk.length];
        for(int i=0; i< mk.length;i++){
           sks[i] = mk[i][2];
        }
        return sks;
    }

    public String[] getKode(){
        kode = new String[mk.length];
        for(int i=0; i< mk.length; i++){
            kode[i] = mk[i][0];
        }
        return kode;
    }

    public String[] getNama(){
        nama = new String[mk.length];
        for(int i=0; i< mk.length ;i++){
            nama[i] = mk[i][1];
        }
        return nama;
    }
}
