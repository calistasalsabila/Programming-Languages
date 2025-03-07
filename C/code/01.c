#include <stdio.h>
int main () {

char input[100];
int total = 0;

printf("masukkan input :  ");
scanf("%s", input);

for(int i = 0 ; input [i] != '\0' ; i++){
   total++;
}
   printf("%d", total);


 return 0;
}