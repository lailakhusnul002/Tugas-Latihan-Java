/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Implements;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        
        // objek laptop
        Laptop HP_Pavilion = new HP_Pavilion();

        // objek user
        LaptopUser Laila = new LaptopUser(HP_Pavilion);

        // menyalakan laptop
        Laila.hidupkanLaptop();
        
        
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Hidupkan Laptop");
            System.out.println("[2] Matikan Laptop");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi= ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                Laila.hidupkanLaptop();
            } else if (aksi.equalsIgnoreCase("2")){
                Laila.matikanLaptop();
            } else if (aksi.equalsIgnoreCase("3")){
                Laila.besarkanVolumeLaptop();
            } else if (aksi.equalsIgnoreCase("4")){
                Laila.kecilkanVolumeLaptop();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}
