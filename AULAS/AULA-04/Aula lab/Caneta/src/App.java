public class App {
    public static void main(String[] args) throws Exception {
        // Cria e instancia um objeto do tipo Caneta
        Caneta c1 = new Caneta();
        c1.iniciarCaneta("Azul", "BIC", 1.0);
        Caneta c2 = new Caneta();
        c2.iniciarCaneta("Vermelha", "Stabillo", 0.4);

        c1.escrever("Ola mundo o batman novo é um bom filme");
        c2.escrever("\nMissão Impossivel pode mesmo ser o homem de ferro?");
        c2.escrever("\nMissão Impossivel pode mesmo ser o homem de ferro?");
        c2.escrever("\nMissão Impossivel pode mesmo ser o homem de ferro?");
        c2.escrever("\nMissão Impossivel pode mesmo ser o homem de ferro?");
        c2.escrever("\nMissão Impossivel pode mesmo ser o homem de ferro?");

        System.out.println("");
 
    }
}