package atividade1;

public class Main {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(35, 60);

        
        System.out.println("Soma: " + calculadora.somar());
        System.out.println("Subtração: " + calculadora.subtrair());
        System.out.println("Multiplicação: " + calculadora.multiplicar());
        System.out.println("Divisão: " + calculadora.dividir());

        int[] numeros = {97, 126, 150, 199, 1000};
        
        for (int numero : numeros) {
            if (calculadora.verificarNumeroPrimo(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }
}

