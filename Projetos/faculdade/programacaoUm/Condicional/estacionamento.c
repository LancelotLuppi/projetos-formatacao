#include <stdio.h>
void main() {
    
    int he, hs, ht, valor;

    printf("Insira o horario de entrada: \n");
    scanf("%d", &he);

    printf("Insira o horario de saida: \n");
    scanf("%d", &hs);

    ht = hs - he;

    if(ht <= 2){
        valor = ht * 5;
    } else if(ht > 2 && ht <= 4) {
        ht = ht - 2;
        valor = 10 + (ht*2);
    } else {
        ht = ht - 4;
        valor = 14 + ht;
    }

    printf("Valor a pagar: %d", valor);
}