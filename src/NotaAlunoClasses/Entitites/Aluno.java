package NotaAlunoClasses.Entitites;

public class Aluno {

    private String nome;
    private double n1;
    private double n2;

    public Aluno() {

    }

    public double calcularMedia(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;

        if (n1 + n2 > 10) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
        return n1 + n2;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}
