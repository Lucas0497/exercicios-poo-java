package Desafio03;

public class Pessoa {
    String nome;
    String nacionalidade;
    int idade;
    float altura;
    boolean trabalhando;

    void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade : " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println(this.nome + " esta trabalhando agora ? " + this.trabalhando);

    }
}
