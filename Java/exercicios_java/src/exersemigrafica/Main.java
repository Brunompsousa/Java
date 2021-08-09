/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exersemigrafica;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;


/**
 *
 * @author Brums
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Exercicio Switch
        //exer10(); 
        
        //media(); 
        
        // Usa a class Calendar
        //idade(); 
        
        // Exercicios de IF
        //execS1();
        
        // Exercicios de IF & Strings
        //execS2();
        
        // Exercicios de IF com &&(e) ||(ou) ^(exclusivo)
        //execS3();
        
        // Exercicios de Operadores
        //ExecO1(); //divisao
        //ExecO2(); // ++ --
        //ExecO3(); // += -=
        //ExecO4(); // Math.Round Ceil Floor
        //ExecO5(); // Math.random
        
        //while1(); //While normal
        //while2(); //While + continue
        //while3(); //While + break
        //do1(); //Com finalizacao de numeros
        //do2(); //Com finalizacao de comparacao de stings
        
        //Exercicio de for
        //for1();
        
        //Exercicio de Arrays
        //array1(); //Array de inteiros
        //array2(); //Array de strings
        
        //foreach1(); // Apenas usado para arrays ou listas
        //foreach2(); // Ordenar um array
        //foreach3(); // Procura em arrays
        
        //array3(); //Preenchimento de arrays com o mesmo valor   
        
        //Funcao sem retorno (procedimento)
        //soma(5,3);
        
        //Funcao com retorno
        //System.out.println("A soma é: " + somaR(5,2));
        
        //System.out.println(Operacoes.contador(1,5));
        
    }
    
    public static void exer10(){
        
       Scanner t = new Scanner(System.in);
        
        System.out.print("Quantas pernas? ");
        int pernas = t.nextInt();
        
        String tipo;
        
        switch(pernas){
            case 1:
                tipo="Saci";
                break;
            case 2:
                tipo="Bipede";
                break;
            case 3:
                tipo="tripede";
                break;
            case 4:
                tipo="Quadrupede";
                break;
            case 6,8:
                tipo="Aranha";
                break;
            default:
                tipo="ET";
        } 
       
        System.out.println("Isto é um(a)" + tipo); 
        
    }
    
    public static void media(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = ((n1+n2)/2);
        System.out.println("A media e " + m);
        
        if(m>9){
            System.out.println("Parabens");
        }
        else{
            System.out.println("Precisa de estudar mais!");
        }
        
    }
    
    public static void idade(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int n1 = teclado.nextInt();
        
        int anoAct = Calendar.getInstance().get(Calendar.YEAR);
        
        System.out.println("A sua idade é " + (anoAct-n1));
        if(anoAct-n1>18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
        
    }
    
    public static void execS1(){
        
        int n1=4,n2=8,r;
        
        r = (n1>n2)?0:1;

        System.out.println(r);
        
        n1=4;
        n2=8;
       
        r = (n1>n2)?n1+n2:n2-n1;

        System.out.println(r);
        
    }

    private static void execS2() {

        //Comparar strings
        String nome1 = "Bruno";
        String nome2 = "Bruno";
        String nome3 = new String("Bruno");
        String res;
        
        res = (nome1==nome2)?"igual":"diferentes";
        System.out.println(res);
        
        res = (nome1==nome3)?"igual":"diferentes";
        System.out.println(res);
        
        res = (nome1.equals(nome3))?"igual":"diferentes";
        System.out.println(res);
        
    }

    private static void execS3() {

        int x=4,y=7,z=12;
        boolean r;
        
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        
        r = (x<y || y==z)?true:false;
        System.out.println(r);
        
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
        
        r = (x<y && y<z)?true:false;
        System.out.println(r);

    }
    
    public static void ExecO1(){
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        float m2 = n1+n2/2;
        
        System.out.println("A media é " + m);
        System.out.println("A media é " + m2);
        
    }
    
    public static void ExecO2(){
        
        int numero = 5;
        
        int valor = 5 + numero++;
        System.out.println("A numero é " + valor);
        
    }
    
    public static void ExecO3(){
        
        int x = 4;
        x+=2;
        System.out.println(x);
        
    }
    
    public static void ExecO4(){
        
        float res = (float) Math.sqrt(25);
        
        System.out.println("sqrt de 25: " + res);
        
        //Arredondar para baixo - Math.floor()
        //Arredondar para cima - Math.ceil()
        //Arredondarmento normal - Math.roumd()
        
        float v = 8.9f;
        
        int ar = (int) Math.floor(v);
        System.out.println("floor de 8.9: " + ar);
        
        ar = (int) Math.ceil(v);
        System.out.println("ceil de 8.9: " + ar);
        
        ar = (int) Math.round(v);
        System.out.println("round de 8.9: " + ar);
        
    }
    
    public static void ExecO5(){
        
        //Numero random de 5 a 10
        double n = 5 + Math.random()*(10-5);
        System.out.println((int)n);
        
        //Numero random de 15 a 50
        n = 15 + Math.random()*(50-15);
        System.out.println((int)n);
        
    }
    
    public static void while1(){
        
        int cc =0;
        
        while(cc < 4){
            
            System.out.println("Cambalhota "+(cc+1));
            cc++;
            
        }
        
    }

    private static void while2() {
        
        int cc =0;
        
        while(cc < 10){
            
            cc++;
            if(cc == 5 || cc==7)
                continue; //Volta ao inicio do while
            System.out.println("Cambalhota "+cc);
            
            
        }
        
    }

    private static void while3() {
        
        int cc =0;
        
        while(cc < 10){
            
            if(cc == 7)
                break; //Salta para fora do while
            System.out.println("Cambalhota "+cc);
            cc++;
            
        }
        
    }
    
    private static void do1(){
        
        int cc =0;
        
        do{
            
            System.out.println("Cambalhota "+(cc+1));
            cc++;
            
        }while(cc<4);
                    
    }

    private static void do2() {
        
        int num, soma=0;
        String resp;
        Scanner t = new Scanner(System.in);
        
        do{
            
            System.out.print("Digite um nuemro: "); 
            num = t.nextInt();
            
            soma += num;
            
            System.out.println("Quer continuar?[S/N]");
            resp = t.next();
            
        }while(resp.equals("S")|| resp.equals("s"));
        
        System.out.println("A soma é " + soma);
        
    }

    private static void for1(){
        
        for(int i = 0;i<4; i++){
            System.out.println("Cambalhota " + i);
        }
        
    }

    private static void array1() {
        
        //int n[] = new int[4]; //Criacao apenas do array sem valores
        
        int n[] = {3,2,8,7,5,4}; // Criacao do array com a dimencao do numero de elementos dados ja com atribuicao dos mesmos
        
        for(int i = 0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
        
        System.out.println("\nTotal de casas do array: " + n.length); //Lenght danos o total das casas do array
        
    }
    
    private static void array2(){
        
        String meses[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int i = 0;i<meses.length;i++){
            System.out.println("O mes de " + meses[i] + " tem " + dias[i] + " dias");
        }
        
    }
    
    private static void foreach1(){
        
        int num[]={3,5,1,8,4};
        
        // 'valor' vai receber um dos valores de 'num' a cada iteracao
        for(int valor: num){
            System.out.println("O numero e " + valor);
        }
        
    }
    
    private static void foreach2(){
        
        int num[]={3,5,1,8,4};
        
        // 'valor' vai receber um dos valores de 'num' a cada iteracao
        for(int valor: num){
            System.out.println("O numero e " + valor);
        }
        
        System.out.println("\nOrdenado");
        Arrays.sort(num);
        
        for(int valor: num){
            System.out.println("O numero e " + valor);
        }
             
    }
  
    private static void foreach3(){
        
        int num[]={3,5,1,8,4};
        
        // 'valor' vai receber um dos valores de 'num' a cada iteracao
        for(int valor: num){
            System.out.println("O numero e " + valor);
        }
        
        int pos = Arrays.binarySearch(num, 1);
        
        System.out.println("A posicao do numero é " + pos);
        
    }
    
    private static void array3(){
        
        int num[] = new int[5];
        
        Arrays.fill(num, 9);
        
        for(int valor:num){
            System.out.println(valor);
        }
        
    }
    
    private static void soma(int a,int b){
        
        int s = a+b;
        System.out.println("A soma é: " + s);
    }
    
    private static int somaR(int a,int b){
        
        int s = a+b;
        return s;
        
    }

}
