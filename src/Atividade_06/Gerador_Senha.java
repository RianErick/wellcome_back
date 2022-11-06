package Atividade_06;

//ESTUDAR ESSE CODIGO
public class Gerador_Senha {

    static String gerarSenha(){

        int qtdeMaximaCaracteres = 8;

        String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();

    }

     public static void main(String[] args) {
        System.out.println(gerarSenha());

    }
}



