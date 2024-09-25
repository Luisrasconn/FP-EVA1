/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        int km,nummes;
        Scanner captu=new Scanner(System.in);
        System.out.println("KILOMETRAJE DEL VEHICULO");
        km=captu.nextInt();
        captu.nextLine();
        System.out.println("NUMERO DE MESES DEL VEHICULO");
        nummes=captu.nextInt();
        captu.nextLine();
        //CON UNA DE LAS COMPARACIONES QUE SE CUMPLA, EL IF ES VERDAD
        if(km>=5000 || nummes>=6){
            System.out.println("SU AUTO OCUPA CAMBIO DE ACEITE");
        }else{
            System.out.println("SU AUTO ESTA EN BUENAS CONDICIONES");
        }
        
    }
}
