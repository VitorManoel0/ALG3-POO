public class Conta {
    private String nome;
    private String CPF;
    private double saldo;


    public Conta(String nome, String CPF, double saldo) {
        this.nome = nome;
        this.CPF = CPF;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaq() {
        return saq;
    }

    public void setSaq(double saq) {
        this.saq = saq;
    }

    public double getDep() {
        return dep;
    }

    public void setDep(double dep) {
        this.dep = dep;
    }

}