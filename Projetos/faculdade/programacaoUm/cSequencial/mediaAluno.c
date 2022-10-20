#include <stdio.h>

void main() {
    int primeiraNota;
    int segundaNota;
    int terceiraNota;

    printf("Primeira nota: \n");
    scanf("%d", &primeiraNota);

    printf("Segunda nota: \n");
    scanf("%d", &segundaNota);

    printf("Terceira nota: \n");
    scanf("%d", &terceiraNota);

    int mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3;

    printf("Sua media eh de %d", mediaNotas);
}