package emojifight;

import java.util.Random;

/**
 *
 * @author Bruno Sousa
 */
public class Luta implements LutaInt {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCatgoria().equals(l2.getCatgoria()) && l1 != l2) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    @Override
    public void Lutar() {
        if(this.getAprovada()){
            System.out.println("---> Desafiado <---");
            this.getDesafiado().apresentar();
            System.out.println("---> Desafiante <---");
            this.getDesafiante().apresentar();
            
            Random rng = new Random();
            int vencedor = rng.nextInt(3); //resultador são 0,1 e 2
            
            switch(vencedor){                
                case 0:
                    System.out.println("---> RESULTADO DA LUTA <---");
                    System.out.println("EMPATE!!!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("---> RESULTADO DA LUTA <---");
                    System.out.println(getDesafiado().getNome() + " GANHOU!!!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("---> RESULTADO DA LUTA <---");
                    System.out.println(getDesafiante().getNome() + " GANHOU!!!");
                    getDesafiado().perderLuta();
                    getDesafiante().ganharLuta();
                    break;         
                default:
                    System.out.println("Pode ter acontecido um erro");
            } 
        }
        else
            System.out.println("A luta nao pode acontecer");
    }

}
