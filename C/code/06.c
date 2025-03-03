#include <stdio.h>
#include <string.h>

int main () {
    char nama [100];
    
    printf("masukkan nama = ");
    scanf("%s", nama); 

    int l = strlen(nama);

    printf("%s\n", nama);

    for (int i = l - 1 ; i >= 0 ; i--){
        printf("%c", nama[i]);
    }

    return 0;
}