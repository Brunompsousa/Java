/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc13;

/**
 *
 * @author Bruno Sousa
 */
public class Exerc13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cao c1 = new Cao();
        c1.reagir("ola");
        c1.reagir("Vais levar");
        
        c1.reagir(11);
        c1.reagir(19);
        
        c1.reagir(true);
        c1.reagir(false);
        
        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);
    }
    
}
