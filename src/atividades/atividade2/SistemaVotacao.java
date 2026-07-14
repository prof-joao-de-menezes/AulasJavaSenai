package atividades.atividade2;

public class SistemaVotacao {
    public static void main(String[] args) {
        // Declare a variável de idade aqui para testar (ex: 15, 17, 25)
        int idade = 25;

        System.out.println("Idade: " + idade);

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 16 && idade <= 17) || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}