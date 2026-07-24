package aulas.heranca.locomocao;

public class MotoACombustao extends Moto{
    public void abastecer(String combustivel){
        System.out.println("Colocando "+ combustivel);
    }

    public void puxarPezinho(){
        System.out.println("Puxando o pé da moto a combustão");
    }
}
