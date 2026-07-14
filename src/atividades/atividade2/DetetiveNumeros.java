package atividades.atividade2;

public class DetetiveNumeros {
    public static void main(String[] args) {
        // Variável inteira a ser analisada
        int numero = -4;

        System.out.println("Analisando o número: " + numero);

        // 1ª Classificação: Par ou Ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é Par.");
        } else {
            System.out.println("O número é Ímpar.");
        }

        // 2ª Classificação: Positivo, Negativo ou Zero
        if (numero > 0) {
            System.out.println("O número é Positivo.");
        } else if (numero < 0) {
            System.out.println("O número é Negativo.");
        } else {
            System.out.println("O número é Zero.");
        }
    }
}