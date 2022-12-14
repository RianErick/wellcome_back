package JogoNumeroSecreto;

import java.util.Random;
import java.util.Scanner;

public class Numero_Secreto {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int nivel;
        int chute = 0;
        int tentativas;
        int status;

        do {
            System.out.println("JOGO DA ADIVINHAÇÃO");
            System.out.println("ESCOLHA O NIVEL DO JOGO :");
            System.out.println("FACIL   1: 20 TENTATIVAS ");
            System.out.println("MEDIO   2: 10 TENTATIVAS");
            System.out.println("DIFICIL 3: 03 TENTATIVAS ");

            nivel = dados.nextInt();
            switch (nivel) {
                case 1:
                    tentativas = 20;
                    break;

                case 2:
                    tentativas = 10;
                    break;

                case 3:
                    tentativas = 3;
                    break;

                default:
                    tentativas = 1;
                    break;

            }

            for (int i = 1; i <= tentativas; i++) {
                System.out.println(" Tentativa " + i + " De " + tentativas);
                System.out.println("QUAL SEU CHUTE?");
                chute = dados.nextInt();

                if (chute == numeroSecreto) {
                    System.out.println("O USUARIO FOI VITORIOSO , PARABÉNS PELA CONQUISTA !");
                    break;
                }
                else if (chute < 0) {
                    System.out.println("O CHUTE NÃO PODE SER NEGATIVO");
                } else if (chute > numeroSecreto) {
                    System.out.println("O CHUTE FOI MAIOR QUE O NUMERO SECRETO");
                } else {
                    System.out.println("O CHUTE FOI MENOR QUE O NUMERO SECRETO");
                }

            }
            if (chute == numeroSecreto){
                System.out.println("GENIAL PARABENS");
            }else {
                System.out.println("PERDEUUUUU CHAPA");
            }

            System.out.println("QUER JOGAR NOVAMENTE? 1 - SIM | 2 - NÃO ");
            status = dados.nextInt();
        } while (status == 1);
    }
}
