/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicioo;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Eva1_15_pantalla_inicioo {

    public static void main(String[] args) {
         final String USUARIO = "ADMIN";
        final String CONTRASEÑA = "ADMIN";
      String usuario,contraseña;
       Scanner captu=new Scanner(System.in);
       System.out.println(" usuario");
       usuario=captu.nextLine();
       System.out.println(" contraseña");
       contraseña=captu.nextLine();
       //COMO VALIDAMOS EL ACCESO
       if(usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA) ){
           System.out.println("ACCESO");
       }else{
           System.out.println("ACCESO denegado");
       }
             
    }
}
