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

    public void adicionarItem(int chave, String valor) {
        Item item = new Item(chave, valor);
        itens[tamanho] = item;
        tamanho++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(itens[i].getChave());
            sb.append(": ");
            sb.append(itens[i].getValor());
            sb.append("\n");
        }
        return sb.toString();
    }
}