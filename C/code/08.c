#include <stdio.h>
#include <string.h>
#include <ctype.h>

void main (){
    char buf [100];
    int i;


    printf("masukkan yang mau di ganti menjadi kapital = ");
        scanf("%s", buf);
    
        for(int i = 0 ; (buf [i] = (char) toupper(buf[i])) != '\0' ; i++){
    }
        printf("Versi huruf kapital adalah %s", buf);

}