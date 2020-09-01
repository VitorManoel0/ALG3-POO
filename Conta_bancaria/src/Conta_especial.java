public class Conta_especial extends Conta {
    private int valor_limite_especial;


    public Conta_especial(String nome, String CPF, double saldo, double saq, double dep, int valor_limite_especial) {
        super(nome, CPF, saldo, saq, dep);
        this.valor_limite_especial = valor_limite_especial;
    }
}
