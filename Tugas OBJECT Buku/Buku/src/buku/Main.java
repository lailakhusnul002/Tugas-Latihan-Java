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
public class Main {
    public static void main(String[] args) {
    Buku puisi = new Buku("Puisi");
    Buku novel = new Buku("Novel");
    Buku catatan = new Buku("Catatan/Nota");
        
        puisi.halamanBuku(50);
        puisi.tebalBuku(3);
        puisi.terjualBuku(200);
        puisi.cetakbuku();
        
        novel.halamanBuku(250);
        novel.tebalBuku(5);
        novel.terjualBuku(500);
        novel.cetakbuku();
        
        catatan.halamanBuku(50);
        catatan.tebalBuku(2);
        catatan.terjualBuku(550);
        catatan.cetakbuku();
    }
}

