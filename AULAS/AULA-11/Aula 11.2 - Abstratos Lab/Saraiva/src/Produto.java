public abstract class Produto implements IGerarDesconto {
    private final double preco;
    private final String nome;
    private int quatidade;
    private final String descricao;
    public Produto(double preco, String nome, int quatidade, String descricao) {
        this.preco = preco;
        this.nome = nome;
        this.quatidade = quatidade;
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public int getQuatidade() {
        return quatidade;
    }
    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }
    public String getDescricao() {
        return descricao;
    }
}
