/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncoches;

import test.Coche;

/**
 *
 * @author Alumno Mañana
 */
public class GestionCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche coche1 = new Coche("aaa", "Renault", "Megane", "negro", 2.16, true);
        Coche coche2 = new Coche("aab", "Renault", "Megane", "blanco", 2.16, true);
        
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
    }
    
}
