/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author USER
 */

public class ListPlanet {
    public static void main(String[] args) {
       
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); 
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); 
        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) { 
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
        planets.remove("venus"); 
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
