package Atividade_08;

import java.util.Scanner;

public class Funcao_Maior_Numero {


    public static void main(String args[]){

        Scanner dados = new Scanner(System.in);

       int a = dados.nextInt();
       int b = dados.nextInt();
       int c = dados.nextInt();
       String nome = dados.nextLine();


        String palavra = n(nome);

       int maior = max(a , b , c);

        System.out.println("Maior " + maior);
        System.out.println("Nome" + palavra);

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

        public static String n (String g){

           return g;
        }
}
