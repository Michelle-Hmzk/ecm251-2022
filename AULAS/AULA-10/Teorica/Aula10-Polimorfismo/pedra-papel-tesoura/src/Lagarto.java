public class Lagarto extends Jogada{

    public Lagarto() {
        super(Enumjogadas.SPOCK, Enumjogadas.PAPEL);
    }

    @Override
    public Enumjogadas getTipo() {
        return Enumjogadas.LAGARTO;
    }
    
}