package Desafio06;

public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle(){
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        this.setVolume(50);

    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.print("Está ligado ? ");
        if (this.isLigado()){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
        System.out.print("Está tocando ? ");
        if (this.isTocando()){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            setVolume(this.getVolume() + 5);
        }

    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            setVolume(this.getVolume() - 5);

        }
    }

    @Override
    public void ligarMudo() {
            if (this.isTocando()){
                this.setTocando(false);
                this.setVolume(0);
                System.out.println("Mute ativado !");
            }
    }

    @Override
    public void desligarMudo() {
            if (!this.isTocando()){
                this.setLigado(true);
                this.setVolume(50);
                System.out.println("Mute desativado !");
        }

    }

    @Override
    public void play() {
            if (!this.isTocando() && this.isLigado()) {
                setTocando(true);
                System.out.println("Play !!!");
            }
        }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()){
            setTocando(false);
            setVolume(0);
            System.out.println("Pause !!!");
        }

    }
}
