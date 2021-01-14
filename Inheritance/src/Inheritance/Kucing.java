/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author USER
 */
public class Kucing extends Hewan {
    public Kucing() {
        super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Kucing");
    }
}
