#include <stdio.h>
void main() {
    int ladoQuadrado;

    printf("Lado do quadrado: \n");
    scanf("%d", &ladoQuadrado);

    int areaQuadrado = ladoQuadrado * ladoQuadrado;

    printf("Area do quadrado: %d", areaQuadrado);
}