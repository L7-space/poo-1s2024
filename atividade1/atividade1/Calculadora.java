package atividade1;

public class Calculadora {
    private int numA;
    private int numB;

    public Calculadora(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int somar() {
        return numA + numB;
    }

    public int subtrair() {
        return numA - numB;
    }

    public int multiplicar() {
        return numA * numB;
    }

    public double dividir() {
        if (numB == 0) {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN; 
        } else {
            return (double) numA / numB;
        }
    }

    public boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
