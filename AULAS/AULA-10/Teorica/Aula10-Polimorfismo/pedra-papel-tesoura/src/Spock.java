public class Spock extends Jogada{

    public Spock() {
        super(Enumjogadas.TESOURA, Enumjogadas.PEDRA);
    }

    @Override
    public Enumjogadas getTipo() {
        return Enumjogadas.SPOCK;
    }
    
}