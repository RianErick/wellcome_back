package SalarioComClasses.entites;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double salarioLiquido;

    public void SalarioBruto(double salario , double taxas){
          this.salarioBruto = salario - (taxas / 100);
    }

}
