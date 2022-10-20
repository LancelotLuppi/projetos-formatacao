// algoritmo: 400

#include <stdio.h>
#include <math.h>
void main() {

    float lado_a, lado_b, lado_c, soma_ab, soma_ac, soma_bc, area, semiperimetro;

    printf("Insira os tres valores: \n");
    scanf("%f%f%f", &lado_a, &lado_b, &lado_c);

    soma_ab = lado_a + lado_b;
    soma_ac = lado_a + lado_c;
    soma_bc = lado_b + lado_c;

    area = -1;

    if(soma_ab > lado_c && soma_ac > lado_b) {
        if(soma_bc > lado_a) {

            semiperimetro = (lado_a + lado_b + lado_c)/2;

            area = sqrt(semiperimetro * (semiperimetro-lado_a)*(semiperimetro-lado_b)
                *(semiperimetro-lado_c));
        }
    }
    printf("Area do triangulo: %f", area);

}