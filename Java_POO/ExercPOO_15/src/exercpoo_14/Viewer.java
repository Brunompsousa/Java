/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpoo_14;

/**
 *
 * @author Bruno Sousa
 */
public class Viewer extends Pessoa{
    private String login;
    private int totVisto;

    public Viewer(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totVisto = 0;
    }
    
    public void vistoMaisUm(){
        setTotVisto(getTotVisto()+1);
    } 

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotVisto() {
        return totVisto;
    }

    public void setTotVisto(int totVisto) {
        this.totVisto = totVisto;
    }

    @Override
    public String toString() {
        return super.toString() + " login=" + login + ", totVisto=" + totVisto + '}';
    }
    
    
}
