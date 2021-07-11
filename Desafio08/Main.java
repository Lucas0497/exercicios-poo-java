package Desafio08;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Pedro", 22, 'M');
        pessoa[1] = new Pessoa("Maria", 25, 'F');

        livro[0] = new Livro("Praticando Java", "José da Silva", 300, pessoa[0]);
        livro[1] = new Livro("POO para iniciantes", "Gustavo Guanabara", 500, pessoa[1]);
        livro[2] = new Livro("Java avançado", "Maria Candido", 800, pessoa[0]);

        livro[0].detalhes();

        for (int i = 0; i < 215 ; i++){
            livro[0].avancarPag();
        }

        livro[0].detalhes();
        livro[0].fechar();
        livro[0].detalhes();

    }
}
