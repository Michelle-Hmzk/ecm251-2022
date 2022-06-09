public class Caneta {
    public final String cor;
    public final double ponta;
    public Caneta(String cor, double ponta) {
        this.cor = cor;
        this.ponta = ponta;
    }
    @Override
    public String toString() {
        return "Caneta [cor=" + cor + ", ponta=" + ponta + "]";
    }
}
