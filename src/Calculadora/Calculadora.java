package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

       float operacao ;
       float n1, n2;
       float result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("***********CALCULADORA**********");
        System.out.println("Digite o primeiro valor");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        n2 = sc.nextInt();
   do{
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - MULTIPLICAR");
        System.out.println("4 - DIVIDIR");

        operacao = sc.nextFloat();


            switch ((int) operacao) {
                case 1:
                    result = n1 + n2;
                    break;

                case 2:
                   result = n1 - n2;
                    break;

                case 3:
                result = n1 * n2;
                    break;

                case 4:
                result = n1 / n2;
                    break;

                default:
                    System.out.println("Numero Invalido Tente Novamente");
            }
        }while (operacao <= 0 || operacao > 4);

        System.out.println("Resultado Foi : " + result);
    }
}