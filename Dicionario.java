public class Dicionario {
    private Item[] itens;
    private int tamanho;

    public Dicionario() {
        int tamanho = 0;
        itens = new Item[10];
    }

    public Dicionario(int tamanho) {
        this.tamanho = tamanho;
        itens = new Item[tamanho];
    }

}