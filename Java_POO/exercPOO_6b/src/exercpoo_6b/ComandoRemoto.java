package exercpoo_6b;
public class ComandoRemoto implements Comando {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ComandoRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Menu");
        System.out.println("Esta ligado: " + this.getLigado());
        System.out.print("Volume: ");
        for(int i = 10;i <= this.getVolume();i+=10)
            System.out.print("|");
        System.out.println(" " + this.getVolume() + "%");
        System.out.println("Esta a tocar: " + this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("A fechar menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() <= 100)
            this.setVolume(this.getVolume()+5);
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(this.getVolume()-5);
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0)
            this.setVolume(50);
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()))
            this.setTocando(true);
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando())
            this.setTocando(false);
    }
    
}
