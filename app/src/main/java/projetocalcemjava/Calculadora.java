package projetocalcemjava;

public class Calculadora {
    public double somar(double a, double b){
        return a + b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }
    public double div(double a, double b){
        if(b == 0.0) System.out.println("Divisão Por Zero Não Pode...");
        return a / b;
    }
}
