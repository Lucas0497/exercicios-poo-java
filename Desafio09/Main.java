package Desafio09;

public class Main {
    public static void main(String[] args) {



        Aluno aluno = new Aluno(515, "Desenvolvimento");
        aluno.setNome("Lucas");
        aluno.setIdade(24);
        aluno.setSexo('M');

        Professor professor = new Professor("Banco de Dados", 3.500f);
        professor.setNome("Gustavo");
        professor.setIdade(37);
        professor.setSexo('M');

        Funcionario funcionario = new Funcionario("Recepção", true);
        funcionario.setNome("Maria ");
        funcionario.setIdade(32);
        funcionario.setSexo('F');




        funcionario.statusFuncionario();
        professor.statusProfessor();
        aluno.statusAluno();






    }
}
