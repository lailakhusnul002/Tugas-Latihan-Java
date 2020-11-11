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
public class OperatonConditional {
    public static void main(String[] args) {
        int nilaitugas1 = 70;
        int nilaitugas2 = 80;
        
        //&& Operator AND
        System.out.println("Conditional AND");
        boolean result = nilaitugas1 == 80 && nilaitugas2 == 80;
        boolean anotherResult = nilaitugas1 != 30 && nilaitugas2 == 80;
        System.out.println("Nilai Tugas ke-1 adalah == 80 dan Nilai Tugas ke-2 == 80 adalah " + result);
        System.out.println("Nilai Tugas ke-1 adalah != 30 dan Nilai Tugas ke-2 == 80 adalah " + anotherResult);
        System.out.println();
        
        //|| Operator OR
        System.out.println("Conditional OR");
        result = nilaitugas1 == 30 || nilaitugas2 == 50;
        anotherResult = nilaitugas1 != 30 || nilaitugas2 == 80;
        System.out.println("Nilai Tugas ke-1 adalah == 30 dan Nilai Tugas ke-2 == 50 adalah " + result);
        System.out.println("Nilai Tugas ke-1 adalah != 30 dan Nilai Tugas ke-2 == 80 adalah " + anotherResult);
        System.out.println();
    } 
}
