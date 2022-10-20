#include <stdio.h>

void main() {
    int x;
    int y;

    printf("Primeiro valor: \n");
    scanf("%d", &x);

    printf("Segundo valor: \n");
    scanf("%d", &y);

    int soma = x + y;

    printf("A soma de %d + %d eh igual a %d", x, y, soma);
}