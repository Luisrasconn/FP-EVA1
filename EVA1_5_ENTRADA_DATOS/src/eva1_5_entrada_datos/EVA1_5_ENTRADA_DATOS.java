/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES
        String marca;
      String modelo;
      int year;
      double precio;
      //¿como se captura informacion?
     //SCANNER
      // Herramienta---> clase:nos proporcioma muchas herramientas
      Scanner captu;//declariacion de la herramienta
      //hay que hacer el import
      captu= new Scanner(System.in);//crear herramienta
      
      //HAY QUE 9INDICARLE AL USUASRIO QUE CAPTE
      System.out.println("introduce la marca del vehiculo");
      //capturamos--->hacer una asignacion
      marca = captu.nextLine();//nextline  regresa todo el texto hasta que le demos enter
                               // se presiona la tecla enter
      
      System.out.println("introduce el modelo del vehiculo");
      modelo=captu.nextLine();
      System.out.println("introduce el año del vehiculo");
      year=captu.nextInt();
      System.out.println("introduce el precio");
      precio=captu.nextDouble();
      
      System.out.println("DATOS CAPTURADOS");
      System.out.println(marca);
      System.out.println(modelo);
      System.out.println(year);
      System.out.println(precio);
      
      
 
    }
    
}
