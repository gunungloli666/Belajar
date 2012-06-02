/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class PU implements MataKuliah , IdMataKuliah{

    public String[][] getMataKuliah() {
        String[][] matkul = {
            {"FI 2012", "Metode Fisika Eksperimen", "2"},
            {"FI 2252", "Metode Numerik", "2"},
            {"FI 2552", "Sistem Instrumentasi", "2"},
            {"FI 2832", "Fisika Lingkungan", "2"},
            {"FI 3012", "Tugas Mandiri", "2"},
            {"FI 3213", "Fisika Matematika III", "3"},
            {"FI 3523", "Elektronika III", "3"},
            {"FI 3572", "Aplikasi Komputer", "2"},
            {"FI 3862", "Mitigasi Bencana Alam", "2"},
            {"FI 4312", "Mekanika Medium Kontinu", "2"},
            {"FI 4323", "Mekanika Kuantum", "3"}
        };

        return  matkul;
    }

    public String toString(){
        return "PU";
    }

    @Override
    public int getID() {
        return 2;
    }
}
