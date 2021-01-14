/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek_Kalender_Peringatan;

import java.util.Calendar;

/**
 *
 * @author USER
 */
public class Kalender_Peringatan {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        System.out.println();
        //Peringatan yang Sudah Lewat
        System.out.println("Acara yang Sudah Selesai");
        System.out.println("========================");
        calendar.add(Calendar.DATE, -15);
        System.out.println("Acara Reuni : " + calendar.getTime());
        System.out.println();
        
        System.out.println("Acara yang Akan Datang");
        System.out.println("======================");
        calendar.add(Calendar.DATE, 58);
        System.out.println("Hari Ulang Tahunmu : " + calendar.getTime());
    
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Hari Ulang Tahun Sahabatmu : " + calendar.getTime());
    }
}
