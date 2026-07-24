package aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Moto motoACombustao = new MotoACombustao();

        motoACombustao.setCombustivel("Gasolina");
        motoACombustao.abastecer(motoACombustao.getCombustivel());

        motoACombustao.puxarPezinho();
    }
}
