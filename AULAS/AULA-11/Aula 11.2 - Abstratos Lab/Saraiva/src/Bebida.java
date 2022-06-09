public class Bebida extends Produto {
    public final EnumCategoriaBebida categoria;
    public final EnumTemperaturaBebida temperatura;
    public Bebida(double preco, String nome, int quatidade, String descricao, EnumCategoriaBebida categoria,
            EnumTemperaturaBebida temperatura) {
        super(preco, nome, quatidade, descricao);
        this.categoria = categoria;
        this.temperatura = temperatura;
    }
    @Override
    public double gerarDesconto() {
        return getPreco()*0.9;
    }
}
