public class Papel extends Jogada{

    public Papel() {
        super(Enumjogadas.PEDRA, Enumjogadas.SPOCK);
    }

    @Override
    public Enumjogadas getTipo() {
        return Enumjogadas.PAPEL;
    }
    
}
