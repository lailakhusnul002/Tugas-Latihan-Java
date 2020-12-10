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
public class HP_Pavilion implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public HP_Pavilion() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Laptop dihidupkan...");
        System.out.println("Selamat datang di HP_Pavilion");
        System.out.println("HP Pavilion g series");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Laptop dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupkan dulu ya Laptop_nya ;) !!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupkan dulu ya Laptop_nya ;) !!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}

