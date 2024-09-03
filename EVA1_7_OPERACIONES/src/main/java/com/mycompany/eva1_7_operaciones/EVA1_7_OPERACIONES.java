/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author fdo_g
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
        //OPERACIONES ARITMETICA
        int x =10;// declaracion y asignacion
        int y = 5;
        //DECLARACION DE MULTIPLES VARIABLE DEL MISMO TIPO
        int suma,resta,divi,multi,pot,raiz;
        //SUMA Y RESTA
        suma=x+y;//operador de suma +
        System.out.println("suma de x + y");
        System.out.println(suma);
        
        resta=x-y;
        System.out.println("resta de x - y");
        System.out.println(resta);
        
        //multiplicacion
        multi=x*y;
        System.out.println("multiplicacion de x*y");
        System.out.println(multi);
        
        // division--> EL MANEJO DE TIPOS DE DATOS
        // SI DIVIDIMOS ENTEROS JAVA DA COMO RESULTADO UN ENTERO
        
        divi=x/y;
        System.out.println("division de x(7)/y(3)");
        System.out.println(divi);
       //cambiemos los valores de x y y
       x=7;
       y=3;
       divi=x/y;
       System.out.println("division de x(7)/y(3)");
        System.out.println(divi);
        
        double val1=11;
        double val2=3;
        double divid;
        divid=val1/val2;
        System.out.println("division entre deciamles");
        System.out.println(divid);
    }
}
