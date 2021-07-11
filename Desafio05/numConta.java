package Desafio05;

public class numConta {
    protected String tipo;
    private String dono;
    private float saldo = 0.00f;
    private boolean status = false;

    public numConta(String tipo, String dono, float saldo, boolean status) {
        this.setSaldo(0.00f);
        this.setStatus(false);
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(150.00f);
        }
        else {
            this.setSaldo(50.00f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não foi possível encerrar a conta");
            System.out.println("É necessário zerar o saldo !");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não foi possível encerrar a conta");
            System.out.println("É necessário quitar o débitos !");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("Erro !!! Conta inexistente");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() > v) {
                saldo = saldo - v;
                System.out.println("Saque realizado com sucesso na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente !");
            }
        } else {
            System.out.println("Conta inexistente, impossível sacar");
        }
    }

    public void pagarMensal() {
        float v = 0.0f;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso.");
                System.out.println("Pagamento realizado por: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente !");
            }
        }else{
            System.out.println("Conta inexistente, impossível pagar taxa mensal");
            }
        }


    public void imprimir (){
        System.out.println("\n\tDADOS DA CONTA");
        System.out.println("Nome: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.print("Status: ");
        if (status){
            System.out.println("Conta ativa !");
        }
        else{
            System.out.println("Conta inativa !");
        }
        System.out.println("=============================");

    }

}










