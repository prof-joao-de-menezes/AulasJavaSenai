package aulas.heranca.atividade.servidoresGDF;

public class ProfessorSEDF extends ServidorGDF{
    private String disciplina;

    public void darAula(){
        System.out.println("Está ministrando aula");
    }

    public void darAula(String disciplina){
        System.out.println("Está ministrando aula de: "+disciplina);
    }
    public void darAula(String disciplina, int quantidadeDeAlunos){
        System.out.println("Está ministrando aula de: "+disciplina+" para um total de: "+quantidadeDeAlunos+" alunos.");
    }

    @Override
    public void baterPonto() {
        System.out.println("Professor bateu ponto");
    }
}
