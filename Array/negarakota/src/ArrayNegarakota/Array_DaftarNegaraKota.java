/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayNegarakota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Array_DaftarNegaraKota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][]negara;
        negara=new String[7][7];
        negara[0][0]="Amerika";
        negara[0][1]="Inggris";
        negara[0][2]="Jepang";
        negara[0][3]="Malaysia";
        negara[0][4]="Indonesia";
        negara[0][5]="Iran";
        negara[0][6]="China";
        
        String[][]ibukota;
        ibukota=new String[7][7];
        ibukota[1][0]="Teheran";
        ibukota[1][1]="Beijing";
        ibukota[1][2]="Jakarta";
        ibukota[1][3]="Tokyo";
        ibukota[1][4]="London";
        ibukota[1][5]="Kuala Lumpur";
        ibukota[1][6]="New York";
        
        List<String> negara1=new ArrayList<>();
        negara1.add("Nama Negara=Amerika, Inggris, Jepang, Malaysia, Indonesia, Iran, China");
        List<String> ibukota1=new ArrayList<>();
        ibukota1.add("Ibukota= Taheran, Beijing, Jakarta, Tokyo, London, Kuala Lunpur, New York");
        
        System.out.println(negara1);
        System.out.println(ibukota1);
        
        System.out.println("Ibukota "+negara[0][4]+" adalah "+ibukota[1][2]);
        System.out.println("Ibukota "+negara[0][2]+" adalah "+ibukota[1][3]);
        System.out.println("Ibukota "+negara[0][5]+" tadalah "+ibukota[1][0]);
        
        }
        
     }
     
    

     
    

