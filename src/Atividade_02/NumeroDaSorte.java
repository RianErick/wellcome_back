package Atividade_02;

import java.util.Scanner;

public class NumeroDaSorte {
    public static void  main(String []args ){

        int idade;
        int valorCompra;
        int numeroDaSorte = 0;


        System.out.println("Gerador De Numero Da Sorte");
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a idade do perticipante?");
        idade = sc.nextInt();
        System.out.println("Qual foi o valor da compra do participante?");
        valorCompra = sc.nextInt();

        sc.close();
          if(valorCompra < 500){
            numeroDaSorte = valorCompra * idade;
        } else if (valorCompra > 500){
            numeroDaSorte = valorCompra - idade;
        } else if (valorCompra == 500) {
            numeroDaSorte = idade * idade;
        } else {
            System.out.println("Algo Deu Errado :0");
        }

        System.out.println("Seu Numero Da Sorte é :" + numeroDaSorte);
    }
}
