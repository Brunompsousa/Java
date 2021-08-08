package inandout;

import java.util.Scanner;


public class InAndOut {

    public static void main(String[] args) {
        
        //ler();
        //intToStrings();
        //stringsToInt();
    }
    
    public static void ler(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite um numero: ");
        float num = teclado.nextFloat();
        
        System.out.println("O nome e "+nome + " e o numero e "+num);
    }
    
    public static void intToStrings(){
        
        //converter int para string
        int idade = 30;
        String valor = Integer.toString(idade);
        
        System.out.println("O valor e " + valor);
        
    }
    
    public static void stringsToInt(){

        String valor = "30";
        int idade = Integer.parseInt(valor);
        
        System.out.println("O valor e " + idade);
        
    }
}
