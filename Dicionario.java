public class Dicionario {
    private Item[] itens;
    private int tamanho;

    public Dicionario() {
        this.tamanho = 0;
        this.itens = new Item[10];
    }

    public Dicionario(int tamanho) {
        this.tamanho = tamanho;
        this.itens = new Item[tamanho];
    }

    public void adicionarItem(int chave, String valor) {
        Item item = new Item(chave, valor);
        this.itens[tamanho] = item;
        tamanho++;
    }

    public int[] getChaves() {
        int[] chaves = new int[this.tamanho];
        for (int i = 0; i < this.tamanho; i++) {
            chaves[i] = this.itens[i].getChave();
        }
        return chaves;
    }

    public String[] getValores() {
        String[] valores = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            valores[i] = this.itens[i].getValor();
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
        return this.tamanho;
    }

    public boolean estaVazio() {
        return this.tamanho == 0;
    }

    public float funcaoDeDispersao(int chave) {
        return chave % this.tamanho;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.itens[i].getChave());
            sb.append(": ");
            sb.append(this.itens[i].getValor());
            sb.append("\n");
        }
        return sb.toString();
    }
}