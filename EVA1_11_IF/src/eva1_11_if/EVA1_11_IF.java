/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL
        //LOGICA BOLEANA ---> OPERACION DE VERDADERO Y FALSO
        //SOLICITATR EDAD EN AÑOS
        int edad;
        Scanner captu= new Scanner(System.in);
        System.out.println("CAPTURA LA EDAD");
        edad=captu.nextInt();
        //DETERMINA SI LA PERSONA ES ADULTO
        // MAYOR O IGUAL A 18
        //>MAYOR QUE
        //<MENOR QUE
        //== IGUAL QUE
        //!= DIFERENTE QUE
        //>= MAYOR O IGUAL QUE
        //< MENOR O IGUAL QUE
        //&& Y (AND)
        //! NEGACION (NOT)
        //LAS OPERACIONES GENERAN COM0 RESULTADO VERDADERO O FALSO
        //SI SON VARIAS INSTRUCCIONES HAY QUE AGRUPAR CON LLAVES
        if(edad>=18){
            System.out.println("ES UN ADULTO");
            
        }else{
            System.out.println("MENOR DE EDAD");
        }
    }
    
}
