package POO_03.application;

import POO_03.entitites.Carteira;
import POO_03.entitites.Produtc;

import java.util.Scanner;


public class Program {

    public static void main(String []args){
        int compra ;
        int QtdComprada;
        int comprarNovamente;

        Scanner sc = new Scanner(System.in);

        Produtc camisaBrasil = new Produtc();
        Produtc chapeusBrasil = new Produtc();
        Carteira carteira = new Carteira();


        camisaBrasil.preco = 29.99;
        camisaBrasil.quantidade = 10;
        camisaBrasil.nome = "Camisa Do Brasil - M Preta";
        camisaBrasil.taxas = 0.99;

        
        chapeusBrasil.preco = 10.99;
        chapeusBrasil.quantidade = 5;
        chapeusBrasil.nome = "Chapeu Brasil";
        chapeusBrasil.taxas = 00.59;


            System.out.println("--Loja Virtual--");
            System.out.println("Define Seu Limite De Compra : R$00,00");
            carteira.saldo = sc.nextDouble();

           do{
            System.out.println("Seu Novo Limite é : R$" + carteira.saldo);
            System.out.println("Escolha a Peça Pelo Numero :");
            System.out.println("1 - Camisas " + "2 - Chapeu");

            compra = sc.nextInt();
            switch (compra) {

                case 1:
                    System.out.println("QUALQUER CAMISA POR 29,99");
                    System.out.println(" 1 - CAMISA DO BRASIL VERMELHA - M");
                    System.out.println(" 2 - CAMISA DO BRASIL AZUL - G");
                    System.out.println(" 3 - CAMISA DO BRASIL PRETA - P");
                    System.out.println(" 4 - CAMISA DO BRASIL PRETA - GG");
                    System.out.println();
                    System.out.println("QUAL SERA A QUANTIDADE ?");
                    QtdComprada = sc.nextInt();
                    camisaBrasil.quantidade -= QtdComprada;
                    carteira.saldo -= ((QtdComprada * camisaBrasil.preco));
                    System.out.println("VALOR DA COMPRA :" + QtdComprada * camisaBrasil.preco);
                    System.out.println("Saldo atual : " + carteira.saldo);
                    System.out.println("Quantidade de Camisas Restantes  "  + camisaBrasil.quantidade);
                    break;

                case 2:
                    System.out.println("QUALQUER CHAPEU POR 10,99");
                    System.out.println("CHAPEU DO BRASIL -  M");
                    System.out.println( "CHAPEU DO BRASIL - G");
                    System.out.println(" CHAPEU DO BRASIL - P");
                    System.out.println();
                    System.out.println("QUAL SERA A QUANTIDADE ?");
                    QtdComprada = sc.nextInt();
                    chapeusBrasil.quantidade -= QtdComprada;
                    carteira.saldo -= (QtdComprada * camisaBrasil.preco);
                    System.out.println("Saldo atual : " + carteira.saldo);
                    System.out.println("VALOR DA COMPRA :" + QtdComprada * chapeusBrasil.preco);
                    System.out.println("Quantidade de Chapeus Restantes  "  +   chapeusBrasil.quantidade);
                    break;

            }
            System.out.println("Dejesa Comprar Novamente?"  + "1 - SIM | 2 - NÃO");
            comprarNovamente = sc.nextInt();
        }while(comprarNovamente != 2);


    }

}
