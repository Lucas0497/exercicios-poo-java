package Desafio11;

public class Peixe extends Animal{
    private String corEscama;


    @Override
    public void locomover() {
        System.out.println("Nadando ");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo comida de peixe =D");


    }

    @Override
    public void emitirSom() {
        System.out.println("ACHO que peixe não emiti som hehe");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolhas(){
        System.out.println("Soltando bolhas ");
    }


}
