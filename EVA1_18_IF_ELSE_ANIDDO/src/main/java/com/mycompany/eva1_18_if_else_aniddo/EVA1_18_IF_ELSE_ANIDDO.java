/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_if_else_aniddo;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_18_IF_ELSE_ANIDDO {

    public static void main(String[] args) {
        int dia;
         Scanner captu=new Scanner(System.in);
        System.out.println("Nùmero Correspondiente al dia (1-7):");
        dia=captu.nextInt();
        
        if(dia==1){
            System.out.println("lunes");
        }else if(dia==2){
            System.out.println("Martes");
        }else if(dia==3){
            System.out.println("miercoles");
        }else if(dia==4){
           System.out.println("Jueves"); 
        }else if(dia==5){
           System.out.println("viernes"); 
        }else if(dia==6){
           System.out.println("sabado"); 
        }else if(dia==7){
           System.out.println("domingo"); 
        }else{
         System.out.println("No es un dia valido(1-7)");   
        }
            
            
    }
}
