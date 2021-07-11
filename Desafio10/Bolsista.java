package Desafio10;

public class Bolsista extends Aluno{
    private int matricula;


    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void  renovarBolsa() {
        this.setMatriculado(true);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com sucesso com o desconto de bolsista");
    }
}
