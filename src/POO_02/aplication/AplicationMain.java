package POO_02.aplication;

import POO_02.entitites.Pessoa;
import java.util.Scanner;

public class AplicationMain {

    public  static void main(String [] args){

        Scanner dados = new Scanner(System.in);

        Pessoa pessoa;
        pessoa = new Pessoa();

        pessoa.nome = dados.nextLine();
        pessoa.idade = dados.nextInt();
        pessoa.cpf = dados.nextLine();
        pessoa.id = dados.nextInt();
        pessoa.altura = dados.nextDouble();
        pessoa.endereco = dados.nextLine();





    }
}
