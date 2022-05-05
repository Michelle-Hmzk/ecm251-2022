public class Pedra extends Jogada{

    public Pedra() {
        super(Enumjogadas.TESOURA, Enumjogadas.LAGARTO);
    }

    @Override
    public Enumjogadas getTipo() {
        return Enumjogadas.PEDRA;
    }

    
    
}
