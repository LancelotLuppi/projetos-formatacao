package br.com.vemser.java.aula2;

public class Repeticoes {
    public static void main(String[] args) {
        System.out.println("Iniciou o for:");
        for(int variavelControle = 0; variavelControle<5; variavelControle++){
            System.out.println(variavelControle);
        }
        System.out.println("For finalizado");

        int teste = 0;
        System.out.println(teste++);
        System.out.println(++teste);
    }
}
