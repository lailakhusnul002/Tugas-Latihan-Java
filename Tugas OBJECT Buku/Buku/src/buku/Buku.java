/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author USER
 */
public class Buku {

   String namabuku;
    int jumlahhalaman;
    int tebalbuku;
    int terjual;
    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Buku(String judul) {
        namabuku = judul;
    }
    public void halamanBuku(int halamanBuku) {
        jumlahhalaman = halamanBuku;
    }
    public void tebalBuku(int tebalBuku) {
        tebalbuku = tebalBuku;
    }
    public void terjualBuku(int terjualBuku) {
        terjual = terjualBuku;
    }
 
    public void cetakbuku() {
        System.out.println("Nama Buku : " + namabuku);
        System.out.println("Jumlah Halaman : " + jumlahhalaman + " lembar");
        System.out.println("Tebal Buku: " + tebalbuku + " cm");
        System.out.println("Buku yang Terjual: " +terjual + " buku");
        System.out.println();
    }
}
    

