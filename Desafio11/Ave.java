package Desafio11;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("Construiu um novo ninho !");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }
}
