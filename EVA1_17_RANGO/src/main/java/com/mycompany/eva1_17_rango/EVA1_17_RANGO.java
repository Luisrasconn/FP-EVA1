/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
       int calif;
       Scanner captu=new Scanner(System.in);
        System.out.println("INTRODUZCA SU CALIFICACION");
        calif=captu.nextInt();
        captu.nextLine();
        if(calif >100  || calif<0){
         System.out.println("SU CALIFICACION NO ES VALIDA");    
        }else{
                
        }if(calif>=70 && calif>100 ){
            System.out.println("NO  APROBO");     
        }else{
           System.out.println(" APROBO"); 
        }
            
    }
}
