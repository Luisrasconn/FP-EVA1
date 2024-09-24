/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_14_TIPO_HACIENDA {

    public static void main(String[] args) {
        
        char tipo;
        Scanner captu=new Scanner(System.in);
        System.out.println(" CAPTURA EL TIPO DE PERSONA F=FISICA M=MORAL");
        tipo=captu.nextLine().charAt(0);
        System.out.println("EL CARACTER ES " + tipo);
        if(tipo=='F'){
            System.out.println("persona fisica");
        }else{
           System.out.println("persona moral"); 
        }
    }
}
