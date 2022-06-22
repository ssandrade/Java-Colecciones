/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.List;

/**
 *
 * @author Sergio
 */
public class Perro {
    
        
    private String raza;
    private List<String> cadPerro;

    public Perro() {
    }

    public Perro(String raza, List<String> cadPerro) {
        this.raza = raza;
        this.cadPerro = cadPerro;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public List<String> getCadPerro() {
        return cadPerro;
    }
    public void setCadPerro(List<String> cadPerro) {
        this.cadPerro = cadPerro;
    }
 
    
}
