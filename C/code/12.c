#include <stdio.h>

int main(){
    int arr [5] = {0,1,2,3,4};
    int *ptrArr = arr;

    printf("elemen ke satu pada array tersebut adalah %d", *(ptrArr + 1));
    return 0;
}