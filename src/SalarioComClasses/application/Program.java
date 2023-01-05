package SalarioComClasses.application;

import SalarioComClasses.entites.Funcionario;

import java.util.Scanner;

public class Program {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario;
        funcionario = new Funcionario();

        System.out.println("Qual Nome Do Funcionario ?");
        funcionario.nome = sc.nextLine();
        System.out.println("Qual seu salario Bruto");
        System.out.println("Qual A Taxa");
        funcionario.SalarioBruto(sc.nextDouble(), sc.nextDouble());

        funcionario.salarioLiquido = funcionario.salarioBruto;
        System.out.println(funcionario.salarioLiquido);
    }

}
