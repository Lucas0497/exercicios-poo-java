package Desafio04;

public class Canetas {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


    public Canetas(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status (){
        System.out.println("\nDADOS DA CANETA ");
        System.out.println("Modelo : " + this.modelo);
        System.out.println("Cor : " + this.cor);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("A caneta esta tampada ? " + this.tampada + "\n");

    }
}
