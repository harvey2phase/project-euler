// Created December, 2017

#include <stdio.h>

int main() {
    int a = 3, b = 5, c = 15, sum = 0;
    while (a < 1000) {
        sum += a;
        a += 3;
    }
    while (b < 1000) {
        sum += b;
        b += 5;
    }
    while (c < 1000) {
        sum -= c;
        c += 15;
    }
    printf("%d\n", sum);
}
