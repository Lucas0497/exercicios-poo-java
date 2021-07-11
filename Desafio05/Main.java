package Desafio05;

public class Main {
    public static void main(String[] args) {
     numConta lucas = new numConta("CC", "Lucas", 0, false);
     numConta ina =  new numConta("CP", "Ina", 0, false);


     ina.setDono("Ina");
     lucas.setDono("Lucas");
     lucas.abrirConta("CP");
     ina.abrirConta("CC");
     lucas.depositar(150);
     ina.depositar(300);
     ina.pagarMensal();


        lucas.imprimir();
        ina.imprimir();

    }
}
