/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerswing12_1;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Brums
 */
public class ExerSwing12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat frmt = new DecimalFormat();
	frmt.setMaximumFractionDigits(2);
        
        int n;
        int contador=0,pares=0,impares=0,mcem=0;
        float media=0;
        
        
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(valor 0 termina)</em></html>"));
        if(n==0){
            media /=contador; 
            break;
        }
        
        contador++;
        
        if(n%2 == 0) pares++;
        else impares++;
        
        if(n>100) mcem++;
        
        media+=n;
        
        }while(n!=0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br> ---------- <br> Total de valores: " + contador + "<br>Total de Pares: " + pares + "<br>Total de Impares: " + impares + "<br>Acima de 100: " + mcem + "<br>Media dos valores: " + frmt.format(media),"Resultado",JOptionPane.WARNING_MESSAGE);
        
    }
    
}
