package exercpoo_5a;

/**
 *
 * @author Brums
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float saldo) {
        if(getStatus())
            setSaldo(getSaldo() + saldo);
        else
            System.out.println("A conta esta fechada");
    }
    
    public void levantar(float saldo) {
        if(getStatus() && getSaldo()>=saldo)
            setSaldo(getSaldo()-saldo);
        else
            System.out.println("Nao pode levantar o valor");
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaBanco{" + "numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
    
    public void abrirConta(String tipo) {
        setStatus(true);
        setTipo(tipo);
        if(getTipo().equals("cc"))
            setSaldo(50f);
        else
            setSaldo(150f); 
    }
    
    public void fecharConta() {
        if(getSaldo() != 0f)
            System.out.println("Conta nao pode ser fechada");
        else
        {
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void pagarMensal(){
        if(getTipo().equals("cc"))
            setSaldo(getSaldo()-12f);
        else
            setSaldo(getSaldo()-20f);
    }
    
}
