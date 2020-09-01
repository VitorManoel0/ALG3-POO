import java.util.Scanner;

public class main {

    public static void main (String[] args){

        int dia;
        int mes;
        int ano;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o dia");
        dia = ler.nextInt();
        System.out.println("Digite o mes");
        mes = ler.nextInt();
        System.out.println("Digite o ano");
        ano = ler.nextInt();

        Data data = new Data(dia,mes,ano);

        System.out.println(data.toString());

    }
}
