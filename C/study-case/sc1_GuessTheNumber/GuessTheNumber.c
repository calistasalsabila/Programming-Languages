#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main () 
{
    int random = 0;
    int kesempatan = 0;
    int yournumber = 0;
    time_t t = 0;

    srand ((unsigned) time (&t));

    random = rand() % 11;

    printf("This is game guess the number");
    printf("\nPilih nomor 1-10");
    printf("\nHanya ada tiga kesempatan");

    for(kesempatan = 3 ; kesempatan > 0 ; --kesempatan ) 
    {
        printf("kamu punya sisa kesempatan %d ", kesempatan);
        printf("\nmasukkan angka yang ingin kamu tebak =    ");
        scanf("%d", &yournumber);


        if (yournumber == random ) 
        {
            printf("Congrats your number is true :D");
            return 0;
        }
        else if (yournumber < 0 || yournumber > 10)
        printf ("Masukkan angka 1 - 10"); 
        else if (yournumber > random)
        printf("Nomormu lebih besar daripada jawaban");
        else if (yournumber < random)
        printf ("Nomormu lebih kecil dari jawaban");
    }
        printf("\nFailed");
        printf("\nJawaban adalah %d ", random);

        return 0;
}
