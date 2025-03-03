#include <stdio.h>
#include <string.h>

int main (){

    char src [20], dest [20];
    strcpy(src, "Kim");
    strcpy(dest, " Dokja");

    strncat(src, dest, 6);

    printf("Our reader is %s", src);

    return 0;
}