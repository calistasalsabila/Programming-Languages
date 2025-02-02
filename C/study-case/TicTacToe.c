#include <stdio.h>
#include <stdlib.h>

char posisikotak[10] = { 'o', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
int pilihan = 0, pemain = 0;

int cekwinordraw();
void displaypapan();
void markpapan(char mark);

int main()
{
    int gameStatus = 0;

    char mark = ' ';

    pemain = 1;

    do
    {
     displaypapan();

      pemain = (pemain % 2) ? 1 : 2;

      printf("pemain %d, pilih papan nomor berapa?: ", pemain);
      scanf("%d", &pilihan);

      mark = (pemain == 1) ? 'X' : 'O';

      markpapan(mark);

      gameStatus = cekwinordraw();

      pemain++;

    }while (gameStatus == -1);

    if (gameStatus == 1)
        printf("==>\apemain %d menang ", --pemain);
    else
        printf("==>\aseri atau hasil imbang");

    return 0;
}

int cekwinordraw()
{
    int returnValue = 0;

    if (posisikotak[1] == posisikotak[2] && posisikotak[2] == posisikotak[3])
    {
        returnValue = 1;
    }
    else if (posisikotak[4] == posisikotak[5] && posisikotak[5] == posisikotak[6])
        returnValue = 1;

    else if (posisikotak[7] == posisikotak[8] && posisikotak[8] == posisikotak[9])
        returnValue = 1;

    else if (posisikotak[1] == posisikotak[4] && posisikotak[4] == posisikotak[7])
        returnValue = 1;

    else if (posisikotak[2] == posisikotak[5] && posisikotak[5] == posisikotak[8])
        returnValue = 1;

    else if (posisikotak[3] == posisikotak[6] && posisikotak[6] == posisikotak[9])
        returnValue = 1;

    else if (posisikotak[1] == posisikotak[5] && posisikotak[5] == posisikotak[9])
        returnValue = 1;

    else if (posisikotak[3] == posisikotak[5] && posisikotak[5] == posisikotak[7])
        returnValue = 1;

    else if (posisikotak[1] != '1' && posisikotak[2] != '2' && posisikotak[3] != '3' &&
        posisikotak[4] != '4' && posisikotak[5] != '5' && posisikotak[6] != '6' && posisikotak[7]
        != '7' && posisikotak[8] != '8' && posisikotak[9] != '9')
        returnValue = 0;
    else
        returnValue = -1;

    return returnValue;
}


void displaypapan()
{
    system("cls");

    printf("\n\n\tTic Tac Toe\n\n");

    printf("pemain 1 (X)  -  pemain 2 (O)\n\n\n");

    printf("     |     |     \n");
    printf("  %c  |  %c  |  %c \n", posisikotak[1], posisikotak[2], posisikotak[3]);

    printf("_____|_____|_____\n");
    printf("     |     |     \n");

    printf("  %c  |  %c  |  %c \n", posisikotak[4], posisikotak[5], posisikotak[6]);

    printf("_____|_____|_____\n");
    printf("     |     |     \n");

    printf("  %c  |  %c  |  %c \n", posisikotak[7], posisikotak[8], posisikotak[9]);

    printf("     |     |     \n\n");
}


void markpapan(char mark)
{
    if (pilihan == 1 && posisikotak[1] == '1')
        posisikotak[1] = mark;

    else if (pilihan == 2 && posisikotak[2] == '2')
        posisikotak[2] = mark;

    else if (pilihan == 3 && posisikotak[3] == '3')
        posisikotak[3] = mark;

    else if (pilihan == 4 && posisikotak[4] == '4')
        posisikotak[4] = mark;

    else if (pilihan == 5 && posisikotak[5] == '5')
        posisikotak[5] = mark;

    else if (pilihan == 6 && posisikotak[6] == '6')
        posisikotak[6] = mark;

    else if (pilihan == 7 && posisikotak[7] == '7')
        posisikotak[7] = mark;

    else if (pilihan == 8 && posisikotak[8] == '8')
        posisikotak[8] = mark;

    else if (pilihan == 9 && posisikotak[9] == '9')
        posisikotak[9] = mark;
    else
    {
        pemain--;
        getchar();
    }
}
