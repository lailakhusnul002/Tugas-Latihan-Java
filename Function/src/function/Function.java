/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author USER
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiMK1 = 70;
        int nilaiMK2 = 65;
        int nilaiMK3 = 80;
        int hasil = Jumlahnilai (nilaiMK1, nilaiMK2, nilaiMK3);
        System.out.println("Total Nilai Mahasiswa adalah = " + hasil);
        
        int jumlah = hasil;
        int jumlahMK = 3;
        double rata = ratarata(jumlah, jumlahMK);
        System.out.println("Nilai Rata-Rata Mahasiswa adalah = " + rata);
    }
    public static int Jumlahnilai(int nilaiMK1, int nilaiMK2, int nilaiMK3) {
        int jumlah = nilaiMK1 + nilaiMK2 + nilaiMK3;
        return jumlah;
    }
    public static double ratarata(int jumlah, int jumlahMK) {
        double nilairata = jumlah / jumlahMK;
        return nilairata;
    }
}
