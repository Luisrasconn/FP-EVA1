/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_22_Califas {

    public static void main(String[] args) {
       int calif;
         Scanner captu=new Scanner(System.in);
        System.out.println("INTRODUCE TU CALIFICACION");
        calif=captu.nextInt();
       if(calif>=90 && calif<=100){
            System.out.println("A");
       }else if(calif>=80 && calif<=89){
           System.out.println("B");
       }else if(calif>=70 && calif<=79){
           System.out.println("c");
        }else if(calif>=60 && calif<=69){
           System.out.println("D");
        }else if(calif>=0 && calif<=59){
           System.out.println("F");
           }else{
            System.out.println("CALIFICACION NO VALIDA");
        }
    }
}
