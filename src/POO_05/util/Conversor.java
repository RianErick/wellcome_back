package POO_05.util;

public class Conversor {

    public static double valorDorlar;
    public static double quantidade;
    public static final double IOF = 15.0;

    public static double calcularTaxas() {
        double valueTotalDolar = quantidade * valorDorlar;
        double percenten = IOF / 100;
        return valueTotalDolar + (percenten * valueTotalDolar);

    }

}
