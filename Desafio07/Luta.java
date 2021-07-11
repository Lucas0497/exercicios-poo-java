package Desafio07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setDesafiante(null);
            this.setDesafiado(null);
            this.setAprovado(false);
        }
    }

    public void lutar(){
        if (this.aprovado){
            System.out.println("####  DESAFIANTE ####");
            this.desafiante.apresentar();
            System.out.println("\n####  DESAFIADO ####");
            this.desafiado.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0 -> {
                    System.out.println("\n----------------------");
                    System.out.println("A Luta empatou !");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("\n----------------------");
                    System.out.println("O lutador " + this.desafiado.getNome() + " venceu essa luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("\n----------------------");
                    System.out.println("O lutador " + this.desafiante.getNome() + " venceu essa luta!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                default -> throw new IllegalStateException("Um ou mais lutadores não estão cadastrados. Por favor, verifique e tente novamente !");
            }
        }else {
            System.out.println("\tERRO ! \nA luta não pode ser gerada porque os lutadores pertencem a categorias diferentes.");
        }
    }
}

