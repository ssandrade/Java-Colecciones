/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perro p = new Perro();
    ArrayList<String> cadPerro = new ArrayList();

    public void CrearPerros() {

        do {
            System.out.println("Ingrese la raza del perro");
            p.setRaza(leer.next());
            String pe = p.getRaza();
            cadPerro.add(pe);
            System.out.println("¿Quiere agregar otro perro?");
        } while (leer.next().equalsIgnoreCase("si"));
        System.out.println("Los perros creados son:");
        for (String aux : cadPerro) {
            System.out.println(aux);
        }
        System.out.println("La cantidad de perros creados son:" + cadPerro.size());
    }

    public void Lista(){
        Iterator<String> it = cadPerro.iterator();
        System.out.println("Inrese el perro que quiere eliminar (Raza)");
        String Raza = leer.next();
        System.out.println("La lista actualizada es: ");
        while(it.hasNext()){
            if(it.next().equals(Raza)){
                it.remove(); 
                break;
            }else{
                System.out.println("No sé encontró el perro que desea eliminar");
            }          
        }   
        for (String aux : cadPerro) {
            System.out.println(aux);
            
        }
        
        
    }
   
    
}
