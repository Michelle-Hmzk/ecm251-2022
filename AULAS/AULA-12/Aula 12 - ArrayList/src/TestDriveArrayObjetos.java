public class TestDriveArrayObjetos {
    public static void main(String[] args) {
        Caneta[] canetas;
        //Cria as referências para as canetas
        //ATENÇÃO: NÃO CRIA AS INSTÂNCIAS!!
        canetas = new Caneta[3];
        //Criação das instâncias
        canetas[0] = new Caneta("Azul", 0.7);
        canetas[1] = new Caneta("Vermelha", 1.0);
        canetas[2] = new Caneta("Rosa", 3.5);

        for(int i = 0; i < canetas.length; i++){
            System.out.println("Cor da caneta:" + canetas[i].cor);
        }
    }
}