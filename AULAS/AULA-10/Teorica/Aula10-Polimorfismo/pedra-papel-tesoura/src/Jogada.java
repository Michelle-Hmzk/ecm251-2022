public class Jogada {
    private Enumjogadas venco;
    private Enumjogadas venco1;
    public Jogada(Enumjogadas venco, Enumjogadas venco1) {
        this.venco = venco;
        this.venco1 = venco1;
    }

    public boolean verificarVenceu(Jogada jogada){
        if(jogada.getTipo().equals(venco))
            return true;
        if (jogada.getTipo().equals(venco1))
            return true;
        return false;
    }

    public Enumjogadas getTipo(){
        return Enumjogadas.PEDRA;
    }
}
