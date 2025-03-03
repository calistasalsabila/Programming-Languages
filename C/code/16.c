#include <stdio.h>
#include <stdlib.h>

int main (){
    int jumlah_string = 0;
    char *nama;

    printf("masukkan jumlah string =   ");
    scanf("%d", &jumlah_string);
    getchar();

    nama = (char *)malloc((jumlah_string + 1) * sizeof(char));
    
    if (nama == NULL){
        printf("gagal mengalokasikan memori");
        return 1;
    }
    printf("masukkan nama = ");
    fgets(nama, jumlah_string + 1, stdin);
   

    printf("nama = %s", nama);

    free(nama);


}