/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Private;

/**
 *
 * @author USER
 */
public class KelasA {
    private int memberA = 10;
    private int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
