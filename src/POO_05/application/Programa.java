package POO_05.application;

import POO_05.util.Conversor;

import java.util.Scanner;

public class Programa {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dolar?");
        Conversor.valorDorlar = sc.nextDouble();

        System.out.println("Quanto Em Dolar Voce Comprar?");
        Conversor.quantidade = sc.nextDouble();

        System.out.println("Taxa 6% IOF");
        System.out.println(Conversor.calcularTaxas());

    }
}
