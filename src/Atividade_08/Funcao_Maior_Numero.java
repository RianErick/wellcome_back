package Atividade_08;

import java.util.Scanner;

public class Funcoes {


    public static void main(String args[]){

        Scanner dados = new Scanner(System.in);
       int a = dados.nextInt();
       int b = dados.nextInt();
       int c = dados.nextInt();


       int maior = max(a , b , c);

       showResult(maior);

       dados.close();
    }

     public static int max(int x , int y , int z){
        int aux;
               if(x > y && x > z){
                 aux = x;
               }else if (y > z){
                 aux = y;
               }else {
                aux = z;
               }

        return aux;

     }
     public static void showResult(int value ){
         System.out.println("Maior = " + value);
     }


}
