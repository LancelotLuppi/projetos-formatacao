// algoritmo : 500

#include <stdio.h>

void main() {

    float nota_um, nota_dois, nota_tres, media_harmonica;

    printf("Insira as tres notas do aluno: \n");
    scanf("%f%f%f", &nota_um, &nota_dois, &nota_tres);

    if(nota_um > nota_dois) {
        float temp = nota_dois;
        nota_dois = nota_um;
        nota_um = temp;
    }
    if(nota_um > nota_tres) {
        float temp = nota_tres;
        nota_tres = nota_um;
        nota_um = temp;
    }

    if(nota_um == 0) {
        media_harmonica = 0;
    } else {
        media_harmonica = 3/((1/nota_um) + (1/nota_dois) + (1/nota_tres));
    }

    printf("Media harmonica: %f", media_harmonica);

}