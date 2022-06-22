/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean confirmacion = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro p = new Perro();
        ServicioPerro sp = new ServicioPerro();
        
        
         sp.CrearPerros();
         sp.Lista();
         
    }

}
