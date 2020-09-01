public class CalculoGrau3 extends CalculoGrau2 {
    private int a;

    public CalculoGrau3(int a, int b, int c, int d) {
        super(b, c, d);
        this.a = a;
    }

    public int Calcular(int x) {
        return a * (x * x * x) + super.Calcular(x);
    }
}
