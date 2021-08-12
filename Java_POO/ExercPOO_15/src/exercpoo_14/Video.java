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
public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int likes;
    private boolean reproduzir;
    
    @Override
    public void play() {
        setReproduzir(true);
    }

    @Override
    public void pause() {
        setReproduzir(false);
    }

    @Override
    public void like() {
        setLikes(getLikes()+1);
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.reproduzir= false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views; //apenas queremos a parte inteira
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean getReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", likes=" + likes + ", reproduzir=" + reproduzir + '}';
    }
    
}
