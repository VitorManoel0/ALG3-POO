import java.util.Scanner;

public class main {

    public static void main(String[] args){

        String nome;
        float raio;
        Scanner ler = new Scanner(System.in);

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

        System.out.println(("Digite o nome do seu circulo:"));
        nome = ler.nextLine();
        System.out.println(("Digite o raio do seu circulo:"));
        raio = ler.nextFloat();

        circulo1.setNome(nome);
        circulo1.setRaio(raio);

        ler.nextLine();

        System.out.println(("Digite o nome do seu outro circulo:"));
        nome = ler.nextLine();
        System.out.println(("Digite o raio do seu outro circulo:"));
        raio = ler.nextFloat();

        circulo2.setNome(nome);
        circulo2.setRaio(raio);

        if (circulo1.area() > circulo2.area()){
            System.out.println((circulo1.getNome()));
        }
        else if (circulo1.area() < circulo2.area()){
            System.out.println((circulo2.getNome()));
        }
        else {
            System.out.println(("Iquais"));
        }

        /*System.out.println((circulo1.diameter()));
        System.out.println((circulo1.area()));
        System.out.println((circulo1.circunferencia()));*/
    }
}
