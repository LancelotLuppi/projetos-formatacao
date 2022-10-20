//algoritmo "S002_S00000150"
// Autor : glbilati
// Data : 09/03/2022

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

	printf("A sua média é de %d \n", mediaNotas);

}
