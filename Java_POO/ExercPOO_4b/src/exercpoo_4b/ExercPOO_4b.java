package exercpoo_4b;

/**
 *
 * @author Brums
 */
public class ExercPOO_4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.setModelo("Bic cristal");
        c1.setPonta(0.7f);
        
        Caneta c2 = new Caneta("Bic",0.5f);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
    }
    
}
