import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Produtos[] produtos = new Produtos[5];
        Scanner ler = new Scanner(System.in);

        int maior = 0, menor = 0;

        for (int i = 0; i < 5; i++) {
            produtos[i] = new Produtos();
            System.out.println("Digite o nome de seu produto");
            produtos[i].setNome(ler.next());
            System.out.println("Digite o preço do seu produto");
            produtos[i].setPreco(ler.nextFloat());
            System.out.println("Digite o código do seu produto");
            produtos[i].setCodigo(ler.nextInt());
        }

        for (int k = 0; k < 5; k++) {
            if (produtos[maior].getPreco() < produtos[k].getPreco()) {
                maior = k;
            }
            if (produtos[menor].getPreco() > produtos[k].getPreco()) {
                menor = k;
            }
        }

        System.out.print("Maior preço : ");
        System.out.println(produtos[maior].getNome());
        System.out.print("Menor preço : ");
        System.out.println(produtos[menor].getNome());

    }
}
