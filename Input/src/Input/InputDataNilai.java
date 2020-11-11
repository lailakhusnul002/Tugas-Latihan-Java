/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class InputDataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data Nilai Mahasiswa");
        System.out.println("==========================");
        
        System.out.print("Masukkan Nama :");
        String nama=scanner.nextLine();
        System.out.print("Masukkan Jurusan :");
        String jurusan=scanner.nextLine();
        System.out.print("Masukkan Kelas :");
        String kls=scanner.nextLine();
        System.out.print("Masukkan Semester :"); 
        int semester = scanner.nextInt();
        System.out.print("Masukkan NIM :"); 
        long nim = scanner.nextLong();
        
        
        
        System.out.print("Masukan Nilai Tugas 1 : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Nilai Tugas 2 : ");
        int anotherValue = scanner.nextInt();
        
        int result = value + anotherValue;
        
        System.out.println("====================");
        System.out.println("Data Nilai Mahasiswa");
        System.out.println("====================");
        System.out.println("Nama="+nama);
        System.out.println("NIM="+nim);
        System.out.println("Jurusan="+jurusan);
        System.out.println("Semester/Kelas="+semester+kls);
        System.out.println("Nilai Tugas 1="+value);
        System.out.println("Nilai Tugas 2="+anotherValue);
        System.out.println("Jumlah Nilai Tugas : " + result);
     
        
    }
}
