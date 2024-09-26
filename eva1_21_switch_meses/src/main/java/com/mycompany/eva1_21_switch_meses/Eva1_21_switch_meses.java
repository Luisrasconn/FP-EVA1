/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_switch_meses;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Eva1_21_switch_meses {

    public static void main(String[] args) {
        int mes;
         Scanner captu=new Scanner(System.in);
        System.out.println("Nùmero Correspondiente al mes (1-12):");
        mes=captu.nextInt();
        
       switch(mes){
           case 1 :
                System.out.println("enero"); 
                break;//ultima instruccion
                case 2 :
                System.out.println("febrero"); 
                break;
                case 3 :
                System.out.println("marzo"); 
                break;
                case 4 :
                System.out.println("abril"); 
                break;
                case 5 :
                System.out.println("mayo"); 
                break;
                case 6 :
                System.out.println("junio"); 
                break;
                case 7 :
                System.out.println("julio"); 
                break;
                case 8 :
                System.out.println("agosto"); 
                break;
                case 9 :
                System.out.println("septiembre"); 
                break;
                case 10 :
                System.out.println("octubre"); 
                break;
                case 11 :
                System.out.println("noviembre"); 
                break;
                case 12 :
                System.out.println("diciembre"); 
                break;
                }
    }
}
