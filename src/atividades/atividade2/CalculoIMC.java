package atividades.atividade2;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();

        if (valor < 10 && valor > 0 || valor == 5) {
            System.out.println("Verdade");
        } else {
            System.out.println("Mentira");
        }
    }
}
