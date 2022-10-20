#include <stdio.h>
void main() {

    float nota_um, nota_dois, nota_tres, nota_rec, 
    media_harmonica, recuperacao, conceito;

    printf("Insira as tres notas do aluno: \n");
    scanf("%f%f%f", &nota_um, &nota_dois, &nota_tres);

    media_harmonica = 3/((1/nota_um) + (1/nota_dois) + (1/nota_tres));

    if(nota_um > nota_tres) {
        float tmp = nota_tres;
        nota_tres = nota_um;
        nota_um = tmp;
    }
    if(nota_um > nota_dois) {
        float tmp = nota_dois;
        nota_dois = nota_um;
        nota_um = tmp;
    }
    
    if(nota_um == 0) {
        media_harmonica = 0;
    }

    recuperacao = 3/((1/10) + (1/nota_dois) + (1/nota_tres));

    if(media_harmonica < 6 && recuperacao >= 6) {
        printf("Nota de recuparacao: \n");
        scanf("%f", &nota_rec);
        media_harmonica = 
            3/((1/nota_rec) + (1/nota_dois) + (1/nota_tres));
    }

    if( media_harmonica < 6) {
        conceito = 0;
    }
    if(media_harmonica >= 6 && media_harmonica < 7) {
        conceito = 1;
    }
    if(media_harmonica >= 7 && media_harmonica < 8) {
        conceito = 2;
    }
    if(media_harmonica >= 8 && media_harmonica < 9) {
        conceito = 3;
    }
    if(media_harmonica >= 9) {
        conceito = 4;
    }
    

    printf("Media harmonica: %f\n Conceito: %f\n", 
        media_harmonica, conceito);


}