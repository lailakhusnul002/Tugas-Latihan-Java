/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_Then_ElseIf_Then_Else;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class If_Then_ElseIf_Then_Else {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        char indeksPrestasi;
        
        System.out.print("Nama Mahasiswa=");
        String nama = scanner.nextLine();
        System.out.print("Jurusan=");
        String jurusan = scanner.nextLine();
        System.out.print("Semester=");
        int semester = scanner.nextInt();
        System.out.print("Nilai Tugas 1=");
        int tugas1 = scanner.nextInt();
        System.out.print("Nilai Tugas 2=");
        int tugas2 = scanner.nextInt();
        System.out.print("Nilai UTS=");
        int uts = scanner.nextInt();
        System.out.print("Nilai UAS=");
        int uas = scanner.nextInt();
        int totalnilai= tugas1+tugas2+uts+uas;
        System.out.println("=====================");
        System.out.println("Total Nilai="+totalnilai);
        System.out.println("=====================");
        float ratarata= totalnilai/4;
        System.out.println("Nilai Rata-Rata="+ratarata);
        
        if (ratarata >= 90) {
            indeksPrestasi = 'A';
        } else if (ratarata >= 80) {
            indeksPrestasi = 'B';
        } else if (ratarata >= 70) {
            indeksPrestasi = 'C';
        } else if (ratarata >= 60) {
            indeksPrestasi = 'D';
        } else if (ratarata >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }
        System.out.println("Nilai Ujian Akhir Anda adalah " + indeksPrestasi);
    }
}
