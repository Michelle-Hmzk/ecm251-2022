public class Sistema {
    public void run(){
        Cliente cliente = new Cliente("Midoria", "123456", "allmight_wannbe@gmail.com");
        Conta conta = new Conta(cliente, 1234);
        System.out.println(conta);
    }
}