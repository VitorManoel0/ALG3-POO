import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String nome;
        String CPF;
        float saldo = 0;
        double requerimento;
        int i,k;
        Scanner ler = new Scanner(System.in);

        Conta cliente;

        System.out.print(("Digite o seu nome:"));
        nome = ler.nextLine();
        System.out.print(("Digite o seu CPF:"));
        CPF = ler.nextLine();

        cliente = new Conta(nome,CPF,saldo);

        do {
            System.out.println("Digite o seu tipo de conta");
            System.out.println("1 - Conta Poupança");
            System.out.println("2 - Conta Especial");
            k = ler.nextInt();
            if (k == 1) {
                System.out.println(("Oque você deseja fazer ?"));
                System.out.println(("0 - Encerrar programa"));
                System.out.println(("1 - Conferir o saldo"));
                System.out.println(("2 - Sacar dinheiro"));
                System.out.println(("3 - Depositar dinheiro"));
                i = ler.nextInt();
                ler.nextLine();

                if (i == 1) {
                    System.out.println((cliente.getSaldo()));
                } else if (i == 2) {
                    System.out.println(("Quanto você deseja sacar ?"));
                    requerimento = ler.nextDouble();

                    cliente.setSaq(requerimento);

                    if (requerimento > cliente.getSaldo()) {
                        System.out.println(("Saldo insuficiente"));
                    } else {
                        System.out.println(("Saldo atual"));
                        System.out.println((cliente.saque()));
                    }

                } else if (i == 3) {
                    System.out.println(("Quanto você deseja depositar ?"));
                    requerimento = ler.nextDouble();

                    cliente.setDep(requerimento);

                    System.out.println(("Saldo atual"));
                    System.out.println((cliente.deposito()));
                }
            }
            else if (k == 2){
                System.out.println(("Oque você deseja fazer ?"));
                System.out.println(("0 - Encerrar programa"));
                System.out.println(("1 - Conferir o saldo"));
                System.out.println(("2 - Sacar dinheiro"));
                System.out.println(("3 - Depositar dinheiro"));
                i = ler.nextInt();
                ler.nextLine();

                if (i == 1) {
                    System.out.println((cliente.getSaldo()));
                } else if (i == 2) {
                    System.out.println(("Quanto você deseja sacar ?"));
                    requerimento = ler.nextDouble();

                    cliente.setSaq(requerimento);

                    if (requerimento > cliente.getSaldo()) {
                        System.out.println(("Saldo insuficiente"));
                    } else {
                        System.out.println(("Saldo atual"));
                        System.out.println((cliente.saque()));
                    }

                } else if (i == 3) {
                    System.out.println(("Quanto você deseja depositar ?"));
                    requerimento = ler.nextDouble();

                    cliente.setDep(requerimento);

                    System.out.println(("Saldo atual"));
                    System.out.println((cliente.deposito()));
                }
            }

        } while (i == 3 || i == 2 || i == 1);
    }
}
