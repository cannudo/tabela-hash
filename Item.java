public class Item {
    public int chave;
    public String valor;

    public Item(int chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public void setChave(int novaChave) {
        this.chave = novaChave;
    }

    public int getChave() {
        return this.chave;
    }

    public void setValor(String novoValor) {
        this.valor = novoValor;
    }

    public String getValor() {
        return this.valor;
    }
}