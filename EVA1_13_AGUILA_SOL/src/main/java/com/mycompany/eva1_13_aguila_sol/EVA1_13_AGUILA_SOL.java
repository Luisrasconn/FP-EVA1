/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_aguila_sol;

/**
 *
 * @author fdo_g
 */
public class EVA1_13_AGUILA_SOL {

    public static void main(String[] args) {
        //ALEATORIO
        //GENERAR NUMEROS ALEATORIOS
       double valor = Math.random();
       //RANDOM GENERA VALORES >= A 0 Y < 1 ES DECIR ENTRE 0 Y .999999999999999
       if (valor <0.5){
           System.out.println("AGUILA");
       }else{
           System.out.println("SOL");
       }
    }
}
