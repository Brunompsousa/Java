
package exercpoo_5a;

/**
 *
 * @author Brums
 */
public class ExercPOO_5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Conta1");
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta("cc");
        conta1.setNumConta(111);
        conta1.setDono("Bruno");
        System.out.println(conta1.toString());
        conta1.depositar(200f);
        conta1.fecharConta();
        conta1.levantar(500f);
        System.out.println(conta1.getSaldo());
        conta1.levantar(50f);
        conta1.pagarMensal();
        conta1.levantar(188f);
        conta1.fecharConta();
        System.out.println(conta1.toString());
        
        System.out.println("Conta2");
        
        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta("cp");
        conta2.setNumConta(114);
        conta2.setDono("Sousa");
        System.out.println(conta2.toString());
        conta2.pagarMensal();
        conta2.fecharConta();
        System.out.println(conta2.toString());
        
        
        
    }
    
}
