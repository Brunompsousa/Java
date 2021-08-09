/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpoo_2b;

/**
 *
 * @author Brums
 */
public class ExercPOO_2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tapar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        
        c2.cor = "preta";
        c2.modelo = "ABC";
        c2.destapar();
        c2.status();
        c2.rabiscar();
               
    }
    
}
