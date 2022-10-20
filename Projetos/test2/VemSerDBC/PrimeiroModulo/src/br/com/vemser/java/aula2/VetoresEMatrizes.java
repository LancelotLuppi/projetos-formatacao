package br.com.vemser.java.aula2;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class VetoresEMatrizes {
    public static void main(String[] args) {
        int [] numeros = new int[5];

        numeros[4] = 5;
        numeros[2] = 17;

        System.out.println(numeros[4]);
        System.out.println(numeros[2]);

        String[] vetorStr = {"Gabriel", "Heloisa", "Leandra"};
        System.out.println(vetorStr[2]);
        System.out.println(vetorStr.length);
        System.out.println(vetorStr[vetorStr.length -1]);

        // Matrizes:
        int[][] matriz = new int[2][2];
        matriz[0][1] = 12;
        matriz[1][1] = 8;
        System.out.println(matriz[0][0]);
        System.out.println(matriz[1][1]);
        System.out.println(matriz[matriz.length-1][matriz[0].length-1]);
        int[][] outraMatriz = {
                {10, 15},
                {15, 20}
        };
    }
}
