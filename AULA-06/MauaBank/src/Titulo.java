import java.time.LocalDate;

public class Titulo {
    //conta que precisa ser paga = valor, data de vencimento e multa
    private double valor;
    private LocalDate data;
    private double multaDiaria;

    //Precisamos de uma data
    public Titulo (double valor, LocalDate data , double multaDiaria){
        this.setValor(valor) ;
        this.setData(data); 
        this.setMultaDiaria(multaDiaria);
}

    public double getMultaDiaria() {
        return multaDiaria;
    }

    public void setMultaDiaria(double multaDiaria) {
        this.multaDiaria = multaDiaria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    }
        
