package exercpoo_10b;
/**
 *
 * @author Bruno Sousa
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public void receberAum(){
        setSalario(getSalario()+salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
