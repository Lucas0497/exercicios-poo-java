package Desafio09;


public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String especialidade, float salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void statusProfessor(){
        System.out.println("\n===== DADOS DO PROFESSOR =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Especialidade " + this.getEspecialidade());
    }

    public void receberAum(int a){
        this.setSalario(this.getSalario() + a);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
