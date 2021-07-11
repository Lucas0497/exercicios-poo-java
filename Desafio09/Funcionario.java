package Desafio09;

public class Funcionario extends Pessoa{
    private String setor;

    public Funcionario(String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    private boolean trabalhando;

    public void statusFuncionario(){
        System.out.println("\n===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.print(this.getNome() + " Esta trabalhando ? ");
        if (trabalhando){
            System.out.println("Sim !");
        }else {
            System.out.println("Não !");
        }
    }

    public void mudarTrabalho(boolean a){
        this.setTrabalhando(a);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
