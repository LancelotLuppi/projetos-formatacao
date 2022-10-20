#include <stdio.h>
void main() {
	float a, b, c;

	printf("Informe 3 valores: \n");
	scanf("%f%f%f", &a, &b, &c);

	if(a < c) {
		float tmp = c;
		c = a;
		a = tmp;
	}
	if(a < b) {
		float tmp = b;
		b = a;
		a = tmp;
	}
	if(b < c) {
		float tmp = c;
		c = b;
		b = tmp;
	}
	printf("%f, %f, %f", a, b, c);
}