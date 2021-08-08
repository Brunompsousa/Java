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
public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tapado;
    
    void rabiscar(){
        
        if(this.tapado == true)
            System.out.println("Erro, nao posso rabiscar");
        else
            System.out.println("Rabiscar");
        
    }
    
    void tapar(){    
        this.tapado = true;
    }
    
    void destapar(){    
        this.tapado = false;       
    }
    
    void status(){
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Esta tapada? " + this.tapado);
    }
    
}


