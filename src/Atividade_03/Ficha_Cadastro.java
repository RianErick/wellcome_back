package Atividade_03;

import java.util.Scanner;

public class Ficha_Cadastro {

    static String nome;
    static int idade;
    static float altura;
    static float peso;
    static int sexo;
    static String sexoo;
    static String cpf;

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("**********TELA DE CADASTRAMENTO PARA CAIXA-ECONOMICA FEDERAL********** ");

        do {
            System.out.println("Digite Seu Completo.");
            nome = dados.nextLine();

        } while (nome.length() < 6 || nome.length() > 100);

        do{
            System.out.println("DIGITE SEU CPF COM 11 DIGITOS");
            cpf = dados.nextLine();

            if(cpf.length() < 11){
                System.out.println("CPF INVALIDO PORFAVOR TENTE NOVAMENTE");
            }

        }while (cpf.length() < 11);

        do {
            System.out.println("Digite Sua Idade.");
            idade = dados.nextInt();
        } while (idade < 0);
        do {
            System.out.println("Digite Sua Altura.");
            System.out.println("Exemplo : 1,75");
            altura = dados.nextFloat();
        } while (altura < 0.0 || altura > 2.90);

        System.out.println("Digite Seu Peso Em Quilos");
        System.out.println("Exemplo : 85,4");
        peso = dados.nextFloat();
    do{
        System.out.println("DIGITE QUAL SEU SEXO :");
        System.out.println("1 - MASCULINO");
        System.out.println("2 - FEMININO");
        System.out.println("3 - OUTRO");
        sexo = dados.nextInt();

            switch (sexo) {
                case 1:
                 sexoo = "Masculino";
                    break;
                case 2:
                   sexoo = "Feminino";
                    break;
                case 3:
                   sexoo = "Outro";
                    break;
                default:
                    System.out.println("ALGO DEU ERRADO , TENTE NOVAMENTE");
            }
        } while (sexo < 1 || sexo > 3) ;

        System.out.println("CADASTRO CONCLUIDO COM SUCESSO !");
        System.out.println("SEGUE DADOS CADASTRADOS  ");
        System.out.println("Nome : " + nome );
        System.out.println("Idade : " + idade);
        System.out.println("Altura : " +altura);
        System.out.println("Peso : " + peso);
        System.out.println("Sexo : "+ sexoo);
        System.out.println("CPF : " + cpf);

    }


}