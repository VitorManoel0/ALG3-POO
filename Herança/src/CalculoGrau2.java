public class CalculoGrau2 extends CalculoGrau1 {
    private int a;

    public CalculoGrau2(int a, int b, int c) {
        super(b, c);
        this.a = a;
    }

    public int Calcular(int x) {
        return this.a * (x * x) + super.Calcular(x);
    }
}