package Atividade_01;

import java.util.Scanner;

public class Tipos_De_Entradas {

    public static void main(String[] args) {

        //entradas tipo double recebem a separaçao  > , < para funcionar
        Scanner inpult = new Scanner(System.in);
        System.out.println("Digite Um Numero Com Virgula Flutuante");
        double x;
        x = inpult.nextDouble();
        System.out.println(x);


        System.out.println("Digite Uma Letra");
        char y;
        y = inpult.next().charAt(0);
        System.out.println(y);

        inpult.close();
    }
}
