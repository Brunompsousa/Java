package exercpoo_4b;

/**
 *
 * @author Brums
 */
public class Caneta {
    
    public String modelo;
    private float ponta;

    public Caneta() {
    }
    
    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", ponta=" + ponta + '}';
    }

    
    

    
    
}


