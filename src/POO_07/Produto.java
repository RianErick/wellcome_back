package POO_07;

public class Produto {

   public String nome;
   public  int quantidade;

    public Produto(String nome , int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
