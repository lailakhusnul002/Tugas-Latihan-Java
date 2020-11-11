/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

/**
 *
 * @author USER
 */
public class OperatorUnary {
    public static void main(String[] args) {
        
        //Unary Plus
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 10;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +10 = " + hasil);
        System.out.println();
        
        //Unary Minus
        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 10;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -10 = " + nilaiAwal2);
        System.out.println();
        
        //Increment
        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 10;
        nilaiAwal3++;
        System.out.println("Hasil 10++ = " + nilaiAwal3);
        System.out.println();
        
        //Decrement
        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 10;
        nilaiAwal4--;
        System.out.println("Hasil 10-- = " + nilaiAwal4);
        System.out.println();
        
        //Komplemen Logika
        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
