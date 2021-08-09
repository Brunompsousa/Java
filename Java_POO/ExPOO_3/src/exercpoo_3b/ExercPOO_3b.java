/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpoo_3b;

/**
 *
 * @author Brums
 */
public class ExercPOO_3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta(); 
        
        c1.modelo = "Bic cristal";
        c1.cor  ="Azul";
        
        c1.carga = 80;
        //c1.tapado = true;
        c1.destapar();
        
        c1.status();
               
    }
    
}
