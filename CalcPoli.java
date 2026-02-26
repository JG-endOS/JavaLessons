abstract class Operacao {

    public abstract double calcular(double a, double b);
}

class Soma extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a + b; 
    }
}

class Subtracao extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a - b; 
    }
}

class Multiplicacao extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a * b; 
    }
}

class Divisao extends Operacao {

    @Override
    public double calcular(double a, double b) {
        return a / b; 
    }
}
public class CalcPoli {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtracao: " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisao: " + divisao.calcular(num1, num2));
    }
}
