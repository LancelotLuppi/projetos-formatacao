package LinkedList;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        if(primeiro == null && ultimo == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;
            tamanho++;
        } else {
            ultimo.setProximo(novoElemento);
            ultimo = novoElemento;
        }
    }
    public void remover(String novoValor) {

    }
    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for(int i = 0; i <= posicao; i++){
            if(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return null;
    }
}
