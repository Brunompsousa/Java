package exercpoo_9b;

/**
 *
 * @author Bruno Sousa
 */
public class ExercPOO_9b {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Bruno", 30, "M");
        p[1] = new Pessoa("Raquel", 27, "F");
        
        l[0] = new Livro("Java", "Jose", 300, p[0]);
        l[1] = new Livro("JS", "Carlos", 120, p[1]);
        l[2] = new Livro("O cao da maria", "Maria", 30, p[1]); 
        
        l[0].detalhes();
        
        p[0].fazerAniv();
        
        l[0].abrir();
        l[0].voltarPag();
        l[0].folhear(300);
        l[0].avancarPag();
        l[0].detalhes();
        
        l[1].detalhes();
        
        
    }
    
}
