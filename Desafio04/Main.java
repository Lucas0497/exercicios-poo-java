package Desafio04;

 class Main {
    public static void main(String[] args) {
        Canetas caneta1 = new Canetas("Bic", "Vermelha", 0.3f, false);
        caneta1.status();

        Canetas caneta2 = new Canetas("Faber Castell ", "Azul", 0.5f, false);
        caneta2.status();
    }
}
