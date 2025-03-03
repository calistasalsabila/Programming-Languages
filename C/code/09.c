#include <stdio.h>

int main (){

    int number = 99;
    int *pnumber = &number;

    printf("%p", pnumber);

    int count = 10, x;
    int *int_poiter;

    int int_pointer = &count;

    printf("count = %i, x = %i\n", count,x);

    return 0;
}