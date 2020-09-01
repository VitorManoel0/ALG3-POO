import java.util.Scanner;

public class main {

    public static void main  (String[] args){

        int i;
        int voto;
        Urna urna = new Urna();
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println(("Oque você deseja fazer ?"));
            System.out.println(("0 - Apurar eleições"));
            System.out.println(("1 - votar"));

            i = ler.nextInt();

            if (i == 1){
                System.out.println("Em que você deseja votar");
                System.out.println("1 - Branco");
                System.out.println("2 - Nulo");
                System.out.println("3 - Candidato 1");
                System.out.println("4 - Candidato 2");

                voto = ler.nextInt();

                if (voto == 1 ){
                    urna.votosb();
                }
                else if (voto == 2){
                    urna.votosn();
                }
                else if (voto == 3){
                    urna.votos1();
                }
                else if (voto == 4){
                    urna.votos2();
                }
                else{
                    System.out.println("Opção inválida");
                }

            }


        }while (i !=0);

        System.out.println("Votos em branco : " + urna.getBrancos());
        System.out.println("Votos em nulo : " + urna.getNulos());
        System.out.println("Votos em Candidato 1 : " + urna.getCandidado1());
        System.out.println("Votos em Candidado 2 : " + urna.getCandidado2());

        if (urna.getCandidado2() > urna.getCandidado1()){
            System.out.println("Vencedor : Candidato 2" );
        }
        if (urna.getCandidado2() < urna.getCandidado1()){
            System.out.println("Vencedor : Candidato 1" );
        }
    }
}
