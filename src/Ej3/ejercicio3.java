/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean con = true;
        int c = 0;
        ArrayList<Alumno> Alumnos = new ArrayList();
        Alumno a = new Alumno();

        do {
            if (c == 0) {
                Alumno a1 = new Alumno();
                System.out.println("¿Como es el nombre del alumno?");
                a1.setNombre(leer.next());
                System.out.println("Ingrese sus tres notas");
                ArrayList<Integer> notasA1 = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    notasA1.add(leer.nextInt());
                    a1.setNotas(notasA1);
                }
                Alumnos.add(a1);

            } else {
                Alumno a2 = new Alumno();
                System.out.println("Ingrese el nombre del alumno");
                a2.setNombre(leer.next());
                System.out.println("Ingrese sus tres notas");
                ArrayList<Integer> notasA1 = new ArrayList();
                for (int i = 0; i < 3; i++) {
                    notasA1.add(leer.nextInt());
                    a2.setNotas(notasA1);
                }
                Alumnos.add(a2);
            }
            c++;
            System.out.println("¿Quiere agregar otro Alumno?");
        } while (leer.next().equalsIgnoreCase("si"));

        do {
            System.out.println("Ingrese el nombre del alumno que desea buscar: ");
            String alum = leer.next();
            double Not=0;
            int cuenta = 0;
            for (Alumno aux : Alumnos){
                
                if (aux.getNombre().equals(alum)) {
                    cuenta=1;
                    for (int i = 0; i < 1; i++) {
                        Not = aux.getNotas().get(i) + aux.getNotas().get(i+1) + aux.getNotas().get(i+2) ;
                    }
                    System.out.println("El promedio del alumno " + aux.getNombre() + " es: " + (Not / 3));
                }   
            }
            if(cuenta!=1){
                System.out.println("El alumno no fue encontrado");
            }
             System.out.println("desea ver otro promedio?");
        }while (leer.next().equalsIgnoreCase("si"));

        }

    
}
