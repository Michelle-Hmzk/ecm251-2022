public class PokemonFogo extends Pokemon{

    public PokemonFogo(int numero, String nome, Status status) {
        super(numero, nome, status);
    }

    @Override
    public boolean evoluir(Status status) {
        if(status == null)
            return false;
        Status atual = super.getStatus();
        atual = super.somarStatus(atual, status);
        atual = super.somarStatus(atual, new Status(0, 10, 0, 0));
        super.setStatus(atual);
        return true;
    }
    
}
