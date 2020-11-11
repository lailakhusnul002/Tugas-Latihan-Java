/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kamera;

/**
 *
 * @author USER
 */
public class Kamera {
    String kamera;
        int baterai;
        
        
        void run(){
        System.out.println(kamera+ "  Berfungsi... ");
        System.out.println("Baterai:"+baterai);
    }
        boolean isDead(){
            if(baterai <=5) return true;
            return false;
        }
}
