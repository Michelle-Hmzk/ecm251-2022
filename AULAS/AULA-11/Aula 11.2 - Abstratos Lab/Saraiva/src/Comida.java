public class Comida extends Produto {
    public final EnumCategoriaComida categoria;
    public final EnumAlergicosComida alergicos;
    public final EnumPimentaComida pimenta;
    public Comida(double preco, String nome, int quatidade, String descricao, EnumCategoriaComida categoria,
            EnumAlergicosComida alergicos, EnumPimentaComida pimenta) {
        super(preco, nome, quatidade, descricao);
        this.categoria = categoria;
        this.alergicos = alergicos;
        this.pimenta = pimenta;
    }
    @Override
    public double gerarDesconto() {
        return getPreco()*0.95;
    }    
}
