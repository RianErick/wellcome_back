package Get_Set;

import java.util.Scanner;

public class Progama {

    public static void main (String [] args ){

        Produto produto = new Produto("Cadeira" , 10 );
        Scanner sc = new Scanner(System.in);
        produto.setNome("Cadeira azul");
        System.out.println(produto.getNome());
    }
}
