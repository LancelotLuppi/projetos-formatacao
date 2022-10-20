#include <stdio.h>
#include <math.h>
void main() {
	
	/* 	
	 *  	Fórmula de Baskhara:
	 * 		delta = b*b - 4*a*c
	 * 		X1 = (-b + sqrt(delta)) / (2*a);
	 * 		X2 = (-b - sqrt(delta)) / (2*a); 		
	 */

	 float a, b, c, x1, x2, delta, multiplicacaoRaiz;

	 printf("Insira o valor do termo a: \n");
	 scanf("%f", &a);

	 printf("Insira o valor do termo b: \n");
	 scanf("%f", &b);

	 printf("Insira o valor do termo c: \n");
	 scanf("%f", &c);

	 delta = b*b - 4*a*c;
	 x1 = (-b + sqrt(delta)) / (2*a);
	 x2 = (-b - sqrt(delta)) / (2*a); 

	 multiplicacaoRaiz = x1 * x2;

	 printf("A multiplicação das raízes é %f", multiplicacaoRaiz);
}