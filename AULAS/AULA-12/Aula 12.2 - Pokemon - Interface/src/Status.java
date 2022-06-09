public class Status {
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;
    public Status(int vida, int ataque, int defesa, int velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public int getVelocidade() {
        return velocidade;
    }
    @Override
    public String toString() {
        return "Status [ataque=" + ataque + ", defesa=" + defesa + ", velocidade=" + velocidade + ", vida=" + vida
                + "]";
    }
}
