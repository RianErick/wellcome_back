package POO_2.Aplication;

import POO_2.Entites.Pessoa;
import java.util.Scanner;

public class AplicationMain {

    public  static void main(String [] args){

        Scanner dados = new Scanner(System.in);

        Pessoa H , M;

        H = new Pessoa();
        M = new Pessoa();


        H.nome = dados.nextLine();
        H.idade = dados.nextInt();
        H.cpf = dados.nextLine();
        H.id = dados.nextInt();
        H.altura = dados.nextDouble();


        M.nome = dados.nextLine();
        M.idade = dados.nextInt();
        M.cpf = dados.nextLine();
        M.id = dados.nextInt();
        M.altura = dados.nextDouble();




    }
}
