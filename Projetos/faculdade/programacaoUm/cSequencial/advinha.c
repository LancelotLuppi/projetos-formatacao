#include <stdio.h>

int main() {

    // Cabeçalho do jogo
    printf(" \n");
    printf("*************************************** \n");
    printf("* Bem-vindo ao meu jogo de advinhacao * \n");
    printf("*************************************** \n");
    printf(" \n");

    int secretNumber = 42;
    int escolhaUsuario;

    printf("Qual a sua escolha? \n");
    scanf("%d", &escolhaUsuario);
    printf("Voce escolheu o numero %d", escolhaUsuario);
}