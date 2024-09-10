/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_12_CALIFAS {
 
    public static void main(String[] args) {
      int calif;
      Scanner captu=new Scanner(System.in);
      System.out.println("ESCRIBE TU CALIFICACION");
      calif=captu.nextInt();
      if(calif<70){
          System.out.println("NA");
      }else{
         System.out.println("ACREDITO!!");  
      }
    }
}
