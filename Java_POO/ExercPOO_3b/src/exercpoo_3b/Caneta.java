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
public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tapado;
    
    private void rabiscar(){      
        if(this.tapado == true)
            System.out.println("Erro, nao posso rabiscar");
        else
            System.out.println("Rabiscar"); 
    }
    
    public void pintar(){      
        if(this.tapado == true)
            System.out.println("Erro, nao posso pintar");
        else
            System.out.println("Pintar"); 
    }
    
    public void tapar(){    
        this.tapado = true;
    }
    
    public void destapar(){    
        this.tapado = false;       
    }
    
    public void status(){
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga : " + this.carga);
        System.out.println("Esta tapada? " + this.tapado);
    }
    
}


