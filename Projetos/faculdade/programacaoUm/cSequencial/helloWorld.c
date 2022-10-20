#include <stdio.h>

void f2(char hello[]) {
    printf("From f2: %d \n", &hello);
    printf("%s", hello);

}

void f1(char hello[]) {
    printf("From f1: %d \n", &hello);
    f2(hello);
}

void main() {

    char hello[] = "Hello World";
    printf("From main: %d \n", &hello);
    f1(hello);

    return;
}