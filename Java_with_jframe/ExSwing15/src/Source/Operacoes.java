/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Brums
 */
class Operacoes {

    private int num = 0;
    private int fat = 1;
    private String form = "";
    

   public void setValor(int n){
       
       num = n;
       int f = 1;
       String s = "";
       for(int i = n; i > 1; i--){
           f*=i;
           s+=i + " * ";
       }
       fat = f;
       form = s + "1 = ";
   }
    
   public int getFact(){
       return fat;
   }
   
   public String getFactForm(){
       return form;
   }
    
}
