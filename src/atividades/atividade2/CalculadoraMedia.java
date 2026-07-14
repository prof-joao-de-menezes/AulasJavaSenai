package atividades.atividade2;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // Declaração das três notas
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.0;

        // Cálculo da média aritmética
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Exibindo a média formatada com duas casas decimais
        System.out.printf("Média Calculada: %.2f\n", media);

        // Verificação das regras de negócio
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Em Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}