#include <stdio.h>

int main (){

    int c = 50;
    int *p = &c;

    printf("alamat dari p sendiri adalah %p\n", &p);
    printf("alamat dari p yang isinya alamat c adalah %p\n", p);
    printf("alamat dari c sendiri adalah %p\n", &c);
    return 0;
}