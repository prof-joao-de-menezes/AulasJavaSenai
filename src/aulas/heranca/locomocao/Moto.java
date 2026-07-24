package aulas.heranca.locomocao;

public class Moto extends Veiculo{
    private String guidao;
    private String combustivel;

    public void puxarPezinho(){
        System.out.println("Puxando pé da moto pra estacionar...");
    }

    public void abastecer(String combustivel){
        System.out.println("Está colocando o combustivel de: "+combustivel);
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
