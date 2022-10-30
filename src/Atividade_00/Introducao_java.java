package Atividade_00;

import java.util.Scanner;

public class Introducao_java {

    public static void main (String [] args){

 int nota1;
 int nota2;
 double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        sc.close();

        media = (double) (nota1 + nota2);
        System.out.println ( "Sua Nota Na Prova Foi : " + media);
        if (media > 7){
            System.out.println("aluno aprovado");
        }else if (media >= 3 && media <= 6) {
            System.out.println("aluno recuperação");

        }else {System.out.println("aluno reprovado");

        }
    }

}

