package Desafio10;

abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getSexo(String m) {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);

    }

    @Override
    public String toString() {
        return "\nPessoa{" +
                "nome='" + this.nome + '\'' +
                ", idade='" + this.idade + '\'' +
                ", sexo='" + this.sexo + '\'' +
                '}';
    }
}
