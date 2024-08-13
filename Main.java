import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        Dicionario teste = new Dicionario();
        teste.adicionarItem(1, "um");
        teste.adicionarItem(2, "dois");
        teste.adicionarItem(3, "tres");
        System.out.println(teste.toString());
        System.out.println("Ponto de debug");
    }
}