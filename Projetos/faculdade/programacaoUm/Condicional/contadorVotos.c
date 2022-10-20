#include <stdio.h>
void main() {

    int cod1, vot1, cod2, vot2, cod3, 
        vot3, cod4, vot4, cod5, vot5,
        total_votos, vereficador;

    float percent1, percent2, percent3, 
        percent4, percent5, percent_eleito;

    printf("Insira o codigo e votos do primeiro candidato: \n");
    scanf("%d%d", &cod1, &vot1);
    printf("Insira o codigo e votos do segundo candidato: \n");
    scanf("%d%d", &cod2, &vot2);
    printf("Insira o codigo e votos do terceiro candidato: \n");
    scanf("%d%d", &cod3, &vot3);
    printf("Insira o codigo e votos do quarto candidato: \n");
    scanf("%d%d", &cod4, &vot4);
    printf("Insira o codigo e votos do quinto candidato: \n");
    scanf("%d%d", &cod5, &vot5);


    total_votos = vot1 + vot2 + vot3 + vot4 + vot5;

    percent1 = (vot1 * 100)/total_votos;
    percent2 = (vot2 * 100)/total_votos;
    percent3 = (vot3 * 100)/total_votos;
    percent4 = (vot4 * 100)/total_votos;
    percent5 = (vot5 * 100)/total_votos;

    vereficador = 0;
    int cod_eleito;

    if(percent1 > 50) {
        cod_eleito = cod1;
        percent_eleito = percent1;
        vereficador = 1;
    }
    if(percent2 > 50) {
        cod_eleito = cod2;
        percent_eleito = percent2;
        vereficador = 1;
    }
    if(percent3 > 50) {
        cod_eleito = cod3;
        percent_eleito = percent3;
        vereficador = 1;
    }
    if(percent4 > 50) {
        cod_eleito = cod4;
        percent_eleito = percent4;
        vereficador = 1;
    }
    if(percent5 > 50) {
        cod_eleito = cod5;
        percent_eleito = percent5;
        vereficador = 1;
    }

    if(vereficador == 0) {
        if(percent1 < percent5) {
            float tmp = percent1;
            percent1 = percent5;
            percent5 = tmp;
            int temp = cod1;
            cod1 = cod5;
            cod5 = temp;
        }
        if(percent1 < percent4) {
            float tmp = percent1;
            percent1 = percent4;
            percent4 = tmp;
            int temp = cod1;
            cod1 = cod4;
            cod4 = temp;
        }
        if(percent1 < percent3) {
            float tmp = percent1;
            percent1 = percent3;
            percent3 = tmp;
            int temp = cod1;
            cod1 = cod3;
            cod3 = temp;
        }
        if(percent1 < percent2) {
            float tmp = percent1;
            percent1 = percent2;
            percent2 = tmp;
            int temp = cod1;
            cod1 = cod2;
            cod2 = temp;
        }

        if(percent2 < percent5) {
            float tmp = percent2;
            percent2 = percent5;
            percent5 = tmp;
            int temp = cod2;
            cod2 = cod5;
            cod5 = temp;
        }
        if(percent2 < percent4) {
            float tmp = percent2;
            percent2 = percent4;
            percent4 = tmp;
            int temp = cod2;
            cod2 = cod4;
            cod4 = temp;
        }
        if(percent2 < percent3) {
            float tmp = percent2;
            percent2 = percent3;
            percent3 = tmp;
            int temp = cod2;
            cod2 = cod3;
            cod3 = temp;
        }

        printf("Primeiro finalista: \n Codigo: %d\n Votos: %f\n",
            cod1, percent1);
        printf("Segundo finalista: \n Codigo: %d\n Votos: %f\n",
            cod2, percent2);
    } else {
        printf("Candidato eleito:\n Codigo: %d\n Votos: %f\n",
            cod_eleito, percent_eleito);
    }
}