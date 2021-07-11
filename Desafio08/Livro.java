package Desafio08;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro (String titulo, String autor, int totPaginas, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setLeitor(leitor);
        this.setAberto(false);
        this.setPagAtual(0);

    }

    public void detalhes(){
        System.out.println("\n======  DETALHES  ======");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.print("O livro está aberto ou fechado ? ");
        if (aberto){
            System.out.println("Aberto");
        }else {
            System.out.println("Fechado");
        }

    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("\nO livro " + this.getTitulo() + "foi aberto na página número: " + this.getPagAtual());



    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("\nVocê fechou o seu livro na página " + this.getPagAtual() + ", até logo !");

    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotPaginas() || p < 0 ){
            System.out.println("Página não encontrada para esse livro !");
        }else {
            this.setPagAtual(p);
        }

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
        this.setAberto(true);


    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);

    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
