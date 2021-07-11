package Desafio10;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private boolean matriculado;

    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso");
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
