package Desafio03;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Lucas";
        pessoa1.idade = 24;
        pessoa1.nacionalidade = "Brasileiro";
        pessoa1.altura = 1.66f;
        pessoa1.trabalhando = false;

        pessoa1.status();
    }
}
