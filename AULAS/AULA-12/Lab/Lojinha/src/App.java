public class App {
    public static void main(String[] args) throws Exception {
        Produto cornDog = new Comida(12.5,"CornDog",5,"Um cachorro quente meio errado",EnumCategoriaComida.COREANA,EnumAlergicos.GLUTEN,EnumPimenta.SUAVE);
        Produto acaiMoleza = new Bebida(10.5,"Acai do moleza" , 1, "Real Fonte de energia", EnumCategoriaBebida.ENERGETICO, EnumTemperatura.FRIO);

        System.out.println("Preços Com Desconto: ");
        System.out.println(cornDog.getNome()+  "\t R$" + precoComDesconto(cornDog));
        System.out.println(acaiMoleza.getNome()+"\t R$"+precoComDesconto(acaiMoleza));
    }

    public static String precoComDesconto(IGerarDesconto produto){
        return "R$"+produto.gerarDesconto();
    }
}
