package exercpoo_10b;

/**
 *
 * @author Bruno Sousa
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhar;
    
    public void mudarTrabalho(){    
            this.setTrabalhar(!getTrabalhar());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhar() {
        return trabalhar;
    }

    public void setTrabalhar(boolean trabalhar) {
        this.trabalhar = trabalhar;
    }
   
}
