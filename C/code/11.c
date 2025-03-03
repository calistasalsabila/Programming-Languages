#include <stdio.h>

void square(int *num){

    *num = (*num) * (*num);

}

int main (){
    int x = 0;
    printf("masukkan angka : ");
    scanf("%d", &x);

    square(&x);
    printf("hasilnya adalah %d", x);
    return 0;

}