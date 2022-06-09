public class PokemonGrama extends Pokemon{

    public PokemonGrama(int numero, String nome, Status status) {
        super(numero, nome, status);
    }

    @Override
    public boolean evoluir(Status status) {
        if(status == null)
            return false;
        Status atual = super.getStatus();
        atual = super.somarStatus(atual, status);
        atual = super.somarStatus(atual, new Status(20, 10, 10, 20));
        super.setStatus(atual);
        return true;
    }
    
}
