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
public class Cao extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if(frase.equals("toma comida") || frase.equals("ola"))
            System.out.println("Abanar a cauda e latir");
        else
            System.out.println("Rosnar");
    }
    
    public void reagir(int h){
        if(h<12)
            System.out.println("Abanar");
        else if(h>=18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar cauda e latir");
    }
    
    public void reagir(boolean dono){
        if(dono)
            System.out.println("Abanar cauda e latir");
        else
            System.out.println("Rosnar");
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5)
            if(peso<10)
                System.out.println("Abanar a cauda");
            else
                System.out.println("Latir");
        else
            if(peso<10)
                System.out.println("Rosnar");
            else
                System.out.println("Ignorar");
    }
}
