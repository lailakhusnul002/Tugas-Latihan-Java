/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticVariable;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);
 
        for (int x = 0 ; x < 5; x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);
    }
}
