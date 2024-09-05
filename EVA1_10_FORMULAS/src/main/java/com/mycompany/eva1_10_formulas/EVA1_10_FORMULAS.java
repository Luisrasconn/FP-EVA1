/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_10_FORMULAS {

    public static void main(String[] args) {
        double velinc,tiempo,acele,dist;
      
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("El valor de la distancia es");
        velinc=captu.nextDouble();
        
        System.out.println("introduce el valor del tiempo");
        tiempo=captu.nextDouble();
        
        System.out.println("introduce el valor de la aceleracion");
        acele=captu.nextDouble();
        
        System.out.println("El valor de la distancia es:");
        dist=velinc*tiempo+(acele*tiempo*tiempo)/2;
        System.out.println(dist);
        
       System.out.println("LOS DATOS DE LA OPERACION FUERON");
        System.out.println("VELOCIDAD INICIAL =" + velinc+ " m/s");
        System.out.println("TIEMPO =" + tiempo+ " s");
        System.out.println("ACELERACION =" + acele+ " m/s2");
        System.out.println("DISTANCIA =" + dist + " m");
       
    }
}
