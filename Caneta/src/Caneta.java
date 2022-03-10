import java.time.format.TextStyle;

public class Caneta {
    String modelo;
    String cor;
    int carga;
    double ponta;
    final int CARGA_INICIAL = 100;

    void iniciarCaneta(String cor, String modelo, double ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = CARGA_INICIAL;
    }

    void escrever(String texto) {
    for (int i = 0; i < texto.length(); i++ ) {
        if (this.carga > 0 ){
            System.out.print(texto.charAt(i));
            this.carga -= 1;
        }
        else {
            System.out.print("\nCANETA SEM CARGA");
            break;
        }
    }
    System.out.println();
}

    String mostrarDados() {
        return "Modelo:" + this.modelo +
                " - Cor: " + this.cor +
                " - Ponta:" + this.ponta +
                " - Carga:" + this.carga;
    }

}