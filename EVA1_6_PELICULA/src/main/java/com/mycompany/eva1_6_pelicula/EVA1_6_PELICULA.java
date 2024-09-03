/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
       String nombre;
       String genero;
       int duracion;
       String reparto;
       String clasificacion;
       
       Scanner captu;
       captu= new Scanner(System.in);
       
       
       System.out.println("INTRODUCE EL NOMBRE DE LA PELICULA");
       nombre=captu.nextLine();
       System.out.println("introduce el genero de la pelicula");
       genero=captu.nextLine();        
       System.out.println("introduce la duracion de la pelicula");
       duracion=captu.nextInt();
       captu.nextLine();
       System.out.println("Introduce el reparto");
       reparto=captu.next();
       System.out.println("introduce la clasificacion de la pelicula");
       clasificacion=captu.next();
        
       System.out.println("datos seleccionados");
       
       System.out.println(nombre);
       System.out.println(genero);
       System.out.println(duracion);
       System.out.println(reparto);
       System.out.println(clasificacion);
       
       

       

       
       
      
      
    }
}
