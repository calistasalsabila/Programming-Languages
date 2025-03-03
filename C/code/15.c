#include <stdio.h> 
int i = 0;
int jumlah = 0;
void samaHuruf (char *huruf, char *hurufsama){
        while(*huruf != '\0') {
            *hurufsama = *huruf;
            huruf++;
            hurufsama++; }

        *hurufsama = '\0';     
}
void hitungHuruf(char *hurufi){
    jumlah = 0;
    while (*hurufi != '\0'){
        jumlah++;
        hurufi++;
    }
}
int main (){
    char satu [] = "calista puyeng";
    char dua [50];

    samaHuruf(satu,dua);
    printf("\nsatu : %s, dua : %s", satu, dua);

    hitungHuruf(satu);
    printf("\njumlah huruf nya adalah %d", jumlah-1);
    return 0;

}