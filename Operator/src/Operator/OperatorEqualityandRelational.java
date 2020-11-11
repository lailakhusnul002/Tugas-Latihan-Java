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
public class OperatorEqualityandRelational {
    public static void main(String[] args) {
        int nilaitugas1 = 70;
        int nilaitugas2 = 90;
        boolean result;
        
        //== sama dengan
        System.out.println("Sama dengan..");
        result = nilaitugas1 == nilaitugas2;
        System.out.println("Hasil 'nilaitugas1 == nilaitugas2' adalah " + result);
        System.out.println();
        
        //!= tidak sama dengan
        System.out.println("Tidak sama dengan..");
        result = nilaitugas1 != nilaitugas2;
        System.out.println("Hasil 'nilaitugas1 != nilaitugas2' adalah " + result);
        System.out.println();
        
        //> lebih besar dari
        System.out.println("Lebih besar dari..");
        result = nilaitugas1 > nilaitugas2;
        System.out.println("Hasil 'nilaitugas1 > nilaitugas2' adalah " + result);
        System.out.println();
        
        //>= sama atau lebih besar
        System.out.println("Sama atau lebih besar dari..");
        result = nilaitugas1 >= nilaitugas2;
        System.out.println("Hasil 'nilaitugas1 >= nilaitugas2' adalah " + result);
        System.out.println();
        
        //< kurang dari
        System.out.println("Kurang dari..");
        result = nilaitugas1 < nilaitugas2;
        System.out.println("Hasil 'nilaitugas1 < nilaitugas2' adalah " + result);
        System.out.println();
        
        //<= sama atau kurang dari
        System.out.println("Sama atau kurang dari dengan..");
        result = nilaitugas1 <= nilaitugas2;
        System.out.println("Hasil 'result <= nilaitugas2' adalah " + result);
        System.out.println();
    }
}
