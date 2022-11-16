package POO_03.application;

import POO_03.entitites.Carteira;
import POO_03.entitites.Produtc;

import java.util.Scanner;

import static POO_03.entitites.Carteira.*;


public class Program {

    public static void main(String []args){
        int compra ;
        int QtdComprada;
        int comprarNovamente;

        Scanner sc = new Scanner(System.in);

        double preco = 29.99;
        int quantidade = 10;
        String  nome = "Camisa Do Brasil ";
        double taxas = 0.99;

        double Bpreco = 19.99;
        int Bquantidade = 10;
        String  Bnome = "Chapeu Do Brasil" ;
        double Btaxas = 0.99;


        double saldo = sc.nextDouble();
        Produtc camisaBrasil = new Produtc(nome, preco, quantidade, taxas);
        Produtc chapeusBrasil = new Produtc(Bnome, Bpreco, Bquantidade, Btaxas);




           do{
               System.out.println("--Loja Virtual--");
             System.out.println("Define Seu Limite De Compra :");
            Carteira carteira = new Carteira(saldo);
             saldo = carteira.getSaldo();
            System.out.println("Seu Novo Limite é : R$" + carteira.getSaldo());
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
                    saldo = saldo - ((QtdComprada * camisaBrasil.preco));
                    System.out.println("VALOR DA COMPRA :" + QtdComprada * camisaBrasil.preco);
                    System.out.println("Saldo atual : " + carteira.getSaldo());
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
                    saldo = saldo - (QtdComprada * camisaBrasil.preco);
                    System.out.println("Saldo atual : " + carteira.getSaldo());
                    System.out.println("VALOR DA COMPRA :" + QtdComprada * chapeusBrasil.preco);
                    System.out.println("Quantidade de Chapeus Restantes  "  +   chapeusBrasil.quantidade);
                    break;


            }
            System.out.println("Dejesa Comprar Novamente?"  + "1 - SIM | 2 - NÃO");
            comprarNovamente = sc.nextInt();
        }while(comprarNovamente != 2);


    }

}
