package POO_08;

import POO_08.Entitites.Aluno;

import java.util.Scanner;

public class Progamn {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Digite Seu Nome Do Aluno");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite A Nota - 1");
        aluno.setN1(sc.nextDouble());
        System.out.println("Digite A Nota - 2");
        aluno.setN2(sc.nextDouble());
        System.out.println(aluno.calcularMedia(aluno.getN1(), aluno.getN2()));


    }

}
