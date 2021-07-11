package Desafio08;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String pedro, int i, char m){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);

    }

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Feliz aniversário " + this.getNome());

    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


