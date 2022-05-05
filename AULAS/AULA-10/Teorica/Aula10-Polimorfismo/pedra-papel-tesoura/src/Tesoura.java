public class Tesoura extends Jogada{

    public Tesoura() {
        super(Enumjogadas.PAPEL, Enumjogadas.LAGARTO);
    }
    @Override
    public Enumjogadas getTipo() {
        return Enumjogadas.TESOURA;
    }
    
}
