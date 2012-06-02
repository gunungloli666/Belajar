/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author mrs_sweet
 */
public class Wajib implements MataKuliah , IdMataKuliah {

    public String[][] getMataKuliah() {
         String[][] matkul = {{"MPK 103", "Pendidikan Agama", "2"},
            {"MPK 105", "Bahasa Indonesia", "2"},
            {"MBB 104", "Bahasa Inggris I", "2"},
            {"MA 1114", "Kalkulus I", "4"},
            {"KI 1113", "Kimia Dasar I", "3"},
            {"BI 1113", "Biologi Umum", "3"},
            {"FI 1114", "Fisika Dasar I", "4"},
            {"MPK 102", "Pendidikan Kewarganegaraan", "2"},
            {"MPK 104", "ISBD", "2"},
            {"MBB 201", "Bahasa Inggris II", "2"},
            {"MA 1124", "Kalkulus II", "4"},
            {"KI 1123", "Kimia Dasar II", "3"},
            {"BI 1123", "Pengetahuan Lingkungan", "2"},
            {"FI 1124", "Fisika Dasar II", "4"},
            {"FI 1212", "Statistika Dasar", "2"},
            {"FI 2214", "Fisika  Matematika I", "4"},
            {"FI 2232", "Metode Komputasi I", "2"},
            {"FI 2313", "Mekanika", "3"},
            {"FI 2321", "Eksperimen Mekanika", "1"},
            {"FI 2413", "Termodinamika", "3"},
            {"FI 2421", "Eksperimen Termodinamika", "1"},
            {"FI 2513", "Elektronika I", "3"},
            {"FI 2521", "Eksperimen Elektronika I", "1"},
            {"FI 2224", "Fisika Matematika II", "4"},
            {"FI 2242", "Metode Komputasi II", "2"},
            {"FI 2333", "Gelombang", "3"},
            {"FI 2341", "Eksperimen Gelombang", "1"},
            {"FI 2533", "Elektronika II", "3"},
            {"FI 2541", "Eksperimen Elektronika II", "1"},
            {"FI 2613", "Fisika Modern", "3"},
            {"FI 2621", "Eksperimen Fisika Modern", "1"},
            {"MBB 301", "KLH&Permukiman", "2"},
            {"FI 3313", "Mekanika Analitik", "3"},
            {"FI 3323", "Fisika Optik", "2"},
            {"FI 3331", "Eksperimen Fisika Optik", "1"},
            {"FI 3413", "Fisika Statistik", "3"},
            {"FI 3513", "Medan Elektromagnet", "3"},
            {"MPK 101", "Pendidikan Pancasila", "2"},
            {"FI 3344", "Fisika Kuantum", "4"},
            {"FI 3613", "Fisika Inti", "3"},
            {"FI 3621", "Eksperimen Fisika Inti", "1"},
            {"FI 3743", "Fisika Zat Padat", "3"},
            {"MBB 401", "KKN", "4"},
            {"MPB 402", "Pendidikan Kewirausahaan", "2"},
            {"FI 4011", "Seminar Skripsi I", "1"},
            {"FI 4021", "Semianr Skripsi II", "1"},
            {"MPB 403", "Ekstrakurikuler", "3"},
            {"FI 4034", "SKRIPSI", "4"}
        };

        return matkul;
    }

   

    @Override
    public String toString(){
        return "Wajib";
    }

    @Override
    public int getID() {
        return 1;
    }
}
