#include <stdio.h>
#include <string.h>

void main () {
    char string1 [] = "Hallo";
    char string2 [] = "Hallo";

    int result = strcmp(string1, string2);

    if(result < 0){
        printf("%s lebih kecil dari %s", string1, string2);
    }
    else if(result == 0){
        printf("%s sama dengan %s", string1, string2);
    }else{
        printf("%s lebih besar dari %s", string1, string2);
    }
    printf("\n%d", strcmp("A", "B"));
    if (strncmp("Astronomy", "Astro", 5) == 0){
        printf("\nSucces");
    }
}