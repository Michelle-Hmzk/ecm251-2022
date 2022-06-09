//import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestDriveArrayList {
    public static void main(String[] args) {
        // Cria um arraylist para as canetas
        ArrayList<Caneta> canetas = new ArrayList<Caneta>(); //<> implementa de forma generica, de caneta
        //Adiciona uma caneta
        canetas.add(new Caneta("Azul", 0.7));
        canetas.add(new Caneta("Roxo", 0.1));
        // Passar por todos os elementos do array 

        //Estudo do size()
        System.out.println("Size agora:"+ canetas.size());

        //Passar pelo elementos
        //Método 1 
        System.out.println("Método 01: for do C");
        for(int i=0;i<canetas.size();i++){
            System.out.println("Cor da caneta:"+canetas.get(i).cor + "\t Com ponta:" + canetas.get(i).ponta);
        }
        // Método 2 
        for (Caneta caneta : canetas) {
            System.out.println("cor da caneta: "+caneta.cor);
        }
    }
}
