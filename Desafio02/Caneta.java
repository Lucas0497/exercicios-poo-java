package Desafio02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    public boolean tampada;

    void status(){
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A ponta da caneta é: " + this.ponta);
        System.out.println("A carga da caneta é: " + this.carga);
        System.out.println("A caneta esta tampada ? " + this.tampada);

    }

     void rabiscar(){
        if (tampada == true){
            System.out.println("Não posso rabiscar pois estou tampada :/");
        }else {
            System.out.println("Estou rabiscando =D");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;

    }


}
