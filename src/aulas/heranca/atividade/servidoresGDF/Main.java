package aulas.heranca.atividade.servidoresGDF;

public class Main {
    public static void main(String[] args) {
        ServidorGDF professor = new ServidorGDF("nome");
        ServidorGDF professorSemParametro = new ServidorGDF();
        professor.baterPonto();
        professor.baterPonto();
        professor.mostrarTexto();
    }
}
