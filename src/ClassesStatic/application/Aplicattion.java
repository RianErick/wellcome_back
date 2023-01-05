package ClassesStatic.application;

import ClassesStatic.util.Calculadora;

import java.util.Scanner;

public class Aplicattion {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO VALOR");
        Calculadora.n1 = sc.nextDouble();
        System.out.println("DIGITE O SEGUNDO VALOR");
        Calculadora.n2 = sc.nextDouble();

        System.out.println("OPERACAO 1  + ,2  - ");

         switch(Calculadora.opr ){
         case 1 :
         Calculadora.result = Calculadora.n1 + Calculadora.n2;
         break;
         case 2 :
         Calculadora.result = Calculadora.n1 - Calculadora.n2;
         break;
         }
         Calculadora.opr = sc.nextInt();
        System.out.println(Calculadora.result);

    }
}
