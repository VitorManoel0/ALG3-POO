import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int x;
        CalculoGrau1 calculo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        a = ler.nextInt();
        System.out.println("Digite o valor de B");
        b = ler.nextInt();
        System.out.println("Digite o valor de C");
        c = ler.nextInt();
        System.out.println("Digite o valor de D");
        d = ler.nextInt();
        System.out.println("Digite o valor de X");
        x = ler.nextInt();

        calculo = new CalculoGrau1(a, b);

        System.out.println("De grau 1");
        System.out.println(calculo.Calcular(x));

        calculo = new CalculoGrau2(a,b,c);

        System.out.println("De grau 2");
        System.out.println(calculo.Calcular(x));

        calculo = new CalculoGrau3(a,b,c,d);

        System.out.println("De grau 3");
        System.out.println(calculo.Calcular(x));

    }
}
