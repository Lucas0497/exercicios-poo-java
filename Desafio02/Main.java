package Desafio02;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Bic";
        caneta1.cor = "Vermelha";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;

        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Faber Castell";
        caneta2.cor = "Preta";
        caneta2.ponta = 0.5f;
        caneta2.carga = 99;

        System.out.println("Caneta 1:");
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();

        System.out.println("\nCaneta 2:");
        caneta2.tampar();
        caneta2.status();
        caneta2.rabiscar();



    }
}
