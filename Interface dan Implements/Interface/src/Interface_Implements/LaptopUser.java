/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Implements;

/**
 *
 * @author USER
 */
public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }
    
    void hidupkanLaptop(){
        this.laptop.powerOn();
    }
    
    void matikanLaptop(){
        this.laptop.powerOff();
    }
    
    void besarkanVolumeLaptop(){
        this.laptop.volumeUp();
    }
    
    void kecilkanVolumeLaptop(){
        this.laptop.volumeDown();
    }
}

