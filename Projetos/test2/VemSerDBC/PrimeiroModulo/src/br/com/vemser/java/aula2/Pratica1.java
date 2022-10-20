package br.com.vemser.java.aula2;

import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Exercicio 1:");
        int[] vetor1 = new int[3];
        vetor1[0] = 1;
        vetor1[1] = 4;
        vetor1[2] = 7;

        int soma = vetor1[0] + vetor1[1] + vetor1[2];
        double media = soma/3;

        System.out.println("Soma dos vetores: " + soma);
        System.out.println("Media dos vetores: " + media);

        System.out.println(" ");
        System.out.println("Exercicio 2:");

        int[][] matriz = {
                {3, 8},
                {9, 15}
        };
        int somaTotal = matriz[0][0] + matriz[0][1] + matriz[1][0] + matriz[1][1];
        int somaLinhaUm = matriz[0][0]  + matriz[0][1];
        int somaLinhaDois = matriz[1][0] + matriz[1][1];
        int calculo = somaLinhaUm - somaLinhaDois;

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Soma da linha um: " + somaLinhaUm);
        System.out.println("Soma da linha dois: " + somaLinhaDois);
        System.out.println("Calculo final: " + calculo);

        System.out.println(" ");
        System.out.println("Exercicio 3:");

        //Repetição
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos elementos deseja colocar?");
        int quantidadeElementos = scan.nextInt();
        scan.nextLine();

        int[] vetor = new int[quantidadeElementos];

        double somador = 0;
        for(int i=0; i<quantidadeElementos; i++){
            System.out.println("Informe o valor da posicao " + i + ":");
            vetor[i] = scan.nextInt();
            scan.nextLine();
            somador += vetor[i];
        }
        double mediaEx3 = somador/quantidadeElementos;
        System.out.println("Media do vetor: " + mediaEx3);


        //While:
        System.out.println(" ");
        System.out.println("Exercicio 4:");

        String palavra;
        do {
            System.out.println("Informe uma palavra: ");
            palavra = scan.nextLine();
            palavra.toLowerCase();
            System.out.println("A palavra que voce digitou foi: " + palavra);

        } while(!palavra.equals("fim"));
    }
}
