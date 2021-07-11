package Desafio07;

public class Lutador implements Lutas {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ){
        setNome(no);
        setIdade(id);
        setNacionalidade(na);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2f) {
            this.categoria = "Abaixo do peso minimo para lutar";
        }else if (this.getPeso() <=  70.3f){
            this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9f){
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2f){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }

    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public void apresentar() {
        System.out.println("-------------------------------------------------");
        System.out.println("\tCHEGOU A HORA !!! \nApresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade() + ".");
        System.out.print("Com " + this.getIdade() + " anos,  " + this.getAltura() + " de altura");
        System.out.println(" e pesando " + this.getPeso() + " Kgs. ");
        System.out.print("Em seu cartel de lutas, ");
        System.out.println(this.getNome() + " tem um total de:\n" + this.getVitorias() + " vitorias, " + this.getEmpates() + " empates e " + this.getDerrotas() + " derrotas");

    }

    @Override
    public void status() {
        System.out.println("--------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");

    }

    @Override
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);

    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);

    }

}
