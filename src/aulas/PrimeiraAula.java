package aulas;

import java.util.Scanner;

/**
 * Na primeira aula tivemos uma atividade que é para enviar um print
 */
public class PrimeiraAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Character letra = 'G';
        char caractere = '?';






        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Qual a sua altura?");
        double altura = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Qual o seu cargo?");
        String cargo = entrada.nextLine();

        System.out.println("Qual o período você estuda no SENAI?");
        String periodo = entrada.nextLine();

        entrada.close();

        System.out.println(
                "\nSuas informações:\n" +
                        "Nome: " + nome + "\n" +
                        "Idade: " + idade + " anos\n" +
                        "Altura: " + altura + "\n" +
                        "Cargo: " + cargo + "\n" +
                        "Período: " + periodo
        );
    }
}
