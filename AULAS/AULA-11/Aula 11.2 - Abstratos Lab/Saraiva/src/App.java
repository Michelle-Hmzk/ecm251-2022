public class App {
    public static void main(String[] args) throws Exception {
        Produto cornDog = new Comida(12.50, "CornDog", 5, "Salsicha empanada", EnumCategoriaComida.COREANA, EnumAlergicosComida.GLUTEM, EnumPimentaComida.SUAVE);
        Produto acaiMoleza = new Bebida(10.50, "Açai do Moleza", 1, "Real fonte alternativa de energia", EnumCategoriaBebida.SUCO, EnumTemperaturaBebida.FRIO);

        System.out.println();
        System.out.println("Preços Regulares:");
        System.out.println(cornDog.getNome() + ":R$" + cornDog.getPreco());
        System.out.println(acaiMoleza.getNome() + ":R$" + acaiMoleza.getPreco());

        System.out.println();
        System.out.println("Preços com Desconto:");
        System.out.println(cornDog.getNome() + precoComDesconto(cornDog));
        System.out.println(acaiMoleza.getNome() + precoComDesconto(acaiMoleza));
        System.out.println();
    }

    public static String precoComDesconto(IGerarDesconto produto){
        return ":R$" + produto.gerarDesconto();
    }
}
