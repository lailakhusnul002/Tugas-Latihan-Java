/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Switch {
     public static void main (String [] denny){
        Scanner scanner = new Scanner (System.in);
       
            System.out.println("Daftar Menu");
            System.out.println("===========");
            System.out.println("1. Nasi Pecel");
            System.out.println("2. Nasi Goreng");
            System.out.println("3. Nasi Soto");
            System.out.println("4. Nasi Rawon");
            System.out.println("5. Nasi Padang");
            System.out.println("6. Mie Goreng");
            System.out.println("7. Mie Kuah");
            System.out.println("8. Kopi");
            System.out.println("9. Es Jeruk");
            System.out.println("10. Es Teh");
            
            System.out.print("Masukkan Nomor Menu yang Anda Pilih= ");
            int menu = scanner.nextInt();
        
        switch (menu){
            case 1:
                System.out.println(" Anda Memilih Menu Nasi Pecel ");
                break;
            case 2:
                System.out.println(" Anda Memilih Menu Nasi Goreng ");
                break;
            case 3:
                System.out.println(" Anda Memilih Menu Nasi Soto ");
                break;
            case 4:
                System.out.println(" Anda Memilih Menu Nasi Rawon ");
                break;
            case 5:
                System.out.println(" Anda Memilih Menu Nasi Padang ");
                break;
            case 6:
                System.out.println(" Anda Memilih Menu Mie Goreng ");
                break;
            case 7:
                System.out.println(" Anda Memilih Menu Mie Kuah ");
                break;
            case 8:
                System.out.println(" Anda Memilih Menu Kopi ");
                break;
            case 9:
                System.out.println(" Anda Memilih Menu Es Jeruk ");
                break;
            case 10:
                System.out.println(" Anda Memilih Menu Es Teh ");
                break;
            
            
        }
    }
}
