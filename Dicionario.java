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

    public int[] getChaves() {
        int[] chaves = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            chaves[i] = itens[i].getChave();
        }
        return chaves;
    }

    public String[] getValores() {
        String[] valores = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            valores[i] = itens[i].getValor();
        }
        return valores;
    }

    public Item encontrarItem(int chave) {
        Item item = this.itens[chave];
        if(item != null) {
            return item;
        } else {
            return null;
        }
    }

    public Item removerItem(int chave) {
        Item item = this.itens[chave];
        if(item != null) {
            this.itens[chave] = null;
            return item;
        } else {
            return null;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
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