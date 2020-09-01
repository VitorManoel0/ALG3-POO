public class Conta_poupanca extends Conta {
    private int dia_rendimento;
    private int tx_rendimento;


    public Conta_poupanca(String nome, String CPF, double saldo, double saq, double dep, int dia_rendimento, int tx_rendimento) {
        super(nome, CPF, saldo, saq, dep);
        this.dia_rendimento = dia_rendimento;
        this.tx_rendimento = tx_rendimento;
    }
}
}
