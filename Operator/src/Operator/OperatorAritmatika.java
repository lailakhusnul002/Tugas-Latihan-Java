/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Operator Aritmatika");
        System.out.println("=========================");
        
        //Penjumlahan
        System.out.println("Operasi Penjumlahan");
        System.out.print("Masukkan Angka Pertama=");
        int penjumlahan1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua=");
        int penjumlahan2 = scanner.nextInt();
        int hasilPenjumlahan = penjumlahan1 + penjumlahan2;
        System.out.print("Hasil= " + hasilPenjumlahan);
        System.out.println();
        
        //Pengurangan
        System.out.println("Operasi Pengurangan");
        System.out.print("Masukkan Angka Pertama=");
        int pengurangan1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua=");
        int pengurangan2 = scanner.nextInt();
        int hasilPengurangan = pengurangan1 - pengurangan2;
        System.out.print("Hasil= " + hasilPengurangan);
        System.out.println();
        
        //Pengalian
        System.out.println("Operasi Pengalian");
        System.out.print("Masukkan Angka Pertama=");
        int pengalian1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua=");
        int pengalian2 = scanner.nextInt();
        int hasilPengalian = pengalian1 * pengalian2;
        System.out.print("Hasil= " + hasilPengalian);
        System.out.println();
        
        //Pembagian
        System.out.println("Operasi Pembagian");
        System.out.print("Masukkan Angka Pertama=");
        int pembagian1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua=");
        int pembagian2 = scanner.nextInt();
        int hasilPembagian = pembagian1 / pembagian2;
        System.out.print("Hasil= " + hasilPembagian);
        System.out.println();
        
        //Habis Bagi
        System.out.println("Operasi Habis bagi");
        System.out.print("Masukkan Angka Pertama=");
        int hasilbagi1 = scanner.nextInt();
        System.out.print("Masukkan Angka Kedua=");
        int hasilbagi2 = scanner.nextInt();
        int hasilBagi = hasilbagi1 % hasilbagi2;
        System.out.print("Hasil= " + hasilBagi);
        System.out.println();
    }
}
