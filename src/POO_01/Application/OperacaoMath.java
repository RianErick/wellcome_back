package POO_01.Application;

import POO_01.Entites.Triangulo;

import java.util.Scanner;

public class OperacaoMath {

   public static void main (String []args){

       Scanner sc = new Scanner(System.in);

       Triangulo x , y ;

       x = new Triangulo();
       y = new Triangulo();


       System.out.println("Qual O Valor do Lado A do triangulo X");
       x.a = sc.nextDouble();
       System.out.println("Qual O Valor do Lado B do triangulo X");
       x.b = sc.nextDouble();
       System.out.println("Qual O Valor do Lado C do triangulo X");
       x.c = sc.nextDouble();

       System.out.println("Qual O Valor do Lado A do triangulo y");
       y.a = sc.nextDouble();
       System.out.println("Qual O Valor do Lado B do triangulo Y");
       y.b = sc.nextDouble();
       System.out.println("Qual O Valor do Lado C do triangulo y");
       y.c = sc.nextDouble();


       double resultadoX = x.resultadoOp();

       double resultadoY = y.resultadoOp();


       if (resultadoX > resultadoX){
           System.out.println("X é Maior");
       }else {
           System.out.println("Y é Maior");
       }

       System.out.println(resultadoX);
       System.out.println(resultadoY);
   }
}
