/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();
 
        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; //secara explisit melakukan casting dari subclass ke superclass
 
        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
