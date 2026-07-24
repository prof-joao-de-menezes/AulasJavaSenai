package aulas.heranca.atividade.servidoresGDF;

public class ServidorGDF {
    private String nome;
    private int matricula;
    private String orgaoLotado;

    public ServidorGDF(String nome){
        this.nome = nome;
    }

    public ServidorGDF(){

    }

    public void baterPonto(){
        System.out.println("METODO CLASSE PAI");
    }
    public void trabalhar(){}

    public void mostrarTexto(){
        System.out.println("Imprimindo texto na tela");
    }
}
