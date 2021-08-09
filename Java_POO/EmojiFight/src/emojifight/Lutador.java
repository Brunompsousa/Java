package emojifight;

/**
 *
 * @author Bruno Sousa
 */
public class Lutador implements LutadorInt {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String catgoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCatgoria();
    }

    public String getCatgoria() {
        return catgoria;
    }

    private void setCatgoria() {

        if (this.peso < 52.2f) {
            this.catgoria = "Inválido";
        } else if (this.peso <= 70.3f) {
            this.catgoria = "Leve";
        } else if (this.peso <= 83.9f) {
            this.catgoria = "Medio";
        } else if (this.peso <= 120.2f) {
            this.catgoria = "Alto";
        } else {
            this.catgoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    /* 
    - - - METODOS - - -   
     */
    @Override
    public void apresentar() {
        System.out.println("-------------------------");
        System.out.println("A ENTRAR NO RING, temos: " + getNome());
        System.out.println("diretamente de : " + getNacionalidade());
        System.out.println("com " + getIdade() + " anos");
        System.out.println("a pesar " + getPeso() + "Kg");
        System.out.println("V/E/D: " + getVitorias() + "/" + getEmpates() + "/" + getDerrotas());
    }

    @Override
    public void status() {
        System.out.print(getNome() + " é um peso " + getCatgoria() + " e tem ");
        System.out.println(getVitorias() + " vitorias, " + getEmpates() + " empates e " + getDerrotas() + " derrotas");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

}
