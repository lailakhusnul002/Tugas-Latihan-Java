/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan_PenjumlahanBarang;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Perulangan_PenjumlahanHargaBarang {
    public static void main(String[] args) {
        int total=0;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Jumlah barang yang dibeli=");
        int psn=input.nextInt();
        for(int x=1; x<=psn; x++){
            System.out.print("Harga barang yang ke"+x+"=");
            int hrg=input.nextInt();
                total = total+hrg;
                
        }
            
            System.out.println("==========================");
            System.out.println("total belanja anda="+total);
            
            int diskon=0;
            if(total >=100000)
                diskon=5000;
            if(total >=300000)
                diskon=15000;
            if(total >=500000)
                diskon=50000;
                        
            System.out.println("Potongan Harga Sebesar=" +diskon);
            System.out.println("-------------------------------");
            System.out.println("Total yang harus dibayar=" +(total-diskon));
        }
}
