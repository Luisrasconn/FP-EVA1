/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses_year;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_19_MESES_YEAR {

    public static void main(String[] args) {
        int MES;
         Scanner captu=new Scanner(System.in);
        System.out.println("Nùmero Correspondiente al dia (1-12):");
        MES=captu.nextInt();
        
        if(MES==1){
            System.out.println("ENERO");
        }else if(MES==2){
            System.out.println("FEBRERO");
        }else if(MES==3){
            System.out.println("MARZO");
        }else if(MES==4){
           System.out.println("ABRIL"); 
        }else if(MES==5){
           System.out.println("MAYO"); 
        }else if(MES==6){
           System.out.println("JUNIO"); 
        }else if(MES==7){
           System.out.println("JULIO"); 
         } else if(MES==8){
           System.out.println("AGOSTO"); 
           }else if(MES==9){
           System.out.println("SEPTIEMBRE");
           }else if(MES==10){
           System.out.println("OCTUBRE");
            }else if(MES==11){
           System.out.println("NOVIEMBRE");
           }else if(MES==12){
           System.out.println("DICIEMBRE");
           }else{
         System.out.println("No es un mes valido(1-12)");   
        }
    }
}
