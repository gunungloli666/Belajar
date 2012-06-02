/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class Kelautan implements MataKuliah, IdMataKuliah {

    public String[][] getMataKuliah() {
       String[][] matkul = {
            {"FI 2812", "Geologi Umum", "2"},
            {"FI 2912", "Pendahuluan Oseanografi", "2"},
            {"FI 2922", "Pendahuluan Hidrodinamika", "2"},
            {"FI 3912", "Arus laut", "2"},
            {"FI 3922", "Gelombang Laut", "2"},
            {"FI 3932", "Pemodelan OSeanografi", "2"},
            {"FI 3832", "Survei dan Pemetaan", "2"},
            {"FI 3942", "Pasang Surut", "2"},
            {"FI 4912", "Praktek Lapang Fisika Kelautan", "2"},
            {"FI 4922", "Dinamika Estuaria", "2"},
            {"FI 4932", "Manajemen Sumberdaya Pesisir", "2"}
        };
        return matkul;
    }

    @Override
   public String toString(){
       return "kelautan";
   }

    @Override
    public int getID() {
        return  4;
    }

}
