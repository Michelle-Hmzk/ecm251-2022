import java.time.LocalDate;

public class Titulo {
    // conta que precisa ser paga = valor, data de vencimento e multa
    private double valor;
    private LocalDate data;
    private double multaDiaria;

    // Precisamos de uma data
    public Titulo(double valor, LocalDate data, double multaDiaria) {
        this.valor = valor;
        this.data = data;
        this.multaDiaria = multaDiaria;
    }

    public double getMultaDiaria() {
        return multaDiaria;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

}
