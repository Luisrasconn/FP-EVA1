/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_9_CONVERSION {

    public static void main(String[] args) {
        double far,cent,kel;
        Scanner captu = new Scanner(System.in);
        
        //CENTIGRADOS A FARENHEIT
        System.out.println("TEMPERATURA EN GRADOS FARENHEIT");
        far=captu.nextDouble();
        cent=(far-32) / 1.8;
        System.out.println("GRADOS CENTIGRADO=  "  + cent);
        
        //FARENHEIT A CENTIGRADOS
        System.out.println("TEMPERATURA EN GRADOS CENTIGRADOS");
        cent=captu.nextDouble();
        far= cent*1.8+32;
        System.out.println("GRADOS FARENHEIT=  "  + far);
        
        //CNTIGRADOS A KELVIN
        System.out.println("TEMPERATURA EN GRADOS CENTIGRADOS");
        cent=captu.nextDouble();
        kel= cent+273.15;
        System.out.println("GRADOS kelvin=  "  + kel);
        
        
        
    }
}
