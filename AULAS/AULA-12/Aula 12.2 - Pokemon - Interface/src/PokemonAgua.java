public class PokemonAgua extends Pokemon{

    public PokemonAgua(int numero, String nome, Status status) {
        super(numero, nome, status);
    }

    @Override
    public boolean evoluir(Status status) {
        if(status == null)
            return false;
        Status atual = super.getStatus();
        atual = super.somarStatus(atual, status);
        atual = super.somarStatus(atual, new Status(0, 0, 10, 0));
        super.setStatus(atual);
        return true;

    }
    
}
