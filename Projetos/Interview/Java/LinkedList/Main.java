package LinkedList;

public class Main {
    public static void main(String[] args) {
        
        ListaLigada lista = new ListaLigada();
        lista.adicionar("charmander");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
    }
}
