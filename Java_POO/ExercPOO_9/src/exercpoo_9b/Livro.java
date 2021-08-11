package exercpoo_9b;
/**
 *
 * @author Bruno Sousa
 */
public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPag;
    private int pagActual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {
        System.out.println("Livro: " + titulo + " escrito por " + autor);
        System.out.println("Leitor/a vai na pag.: " + pagActual + " / " + totPag);
        System.out.println("Livros esta " + aberto);
        System.out.println("Leitor/a: " + leitor.getNome() + " Idada: "+ leitor.getIdade() + " Sexo: " + leitor.getSexo());
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getAberto() && this.getPagActual() == p)
            System.out.println("Já esta na pagina");
        else if(this.getAberto() && getTotPag() >= p && p > 0)
                setPagActual(p);
            else
                System.out.println("A pagina para quer ir nao existe ou o livro esta fechado");
    }

    @Override
    public void avancarPag() {
        if(this.getAberto() && this.getPagActual() < this.getTotPag())
            this.setPagActual(this.getPagActual()+1);
        else
            System.out.println("O livro chegou ao fim ou esta fechado!");
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagActual() > 1)
            this.setPagActual(this.getPagActual()-1);
        else
            System.out.println("O livro nao tem pagina antes ou esta fechado!");
    }
    
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagActual=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagActual() {
        return pagActual;
    }

    public void setPagActual(int pagActual) {
        this.pagActual = pagActual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
