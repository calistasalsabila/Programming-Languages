#include <stdio.h>

void copyString(char *to,  char *from) {
    for(; *from != '\0'; ++from, ++to)
        *to = *from;
    *to = '\0';  // Tambahkan null-terminator di akhir string tujuan
}

int main() {
    char source[] = "Hello, World!";  // String sumber
    char destination[50]; // Pastikan cukup besar untuk menampung source

    copyString(destination, source); // Memanggil fungsi copyString

    printf("Source: %s\n", source);
    printf("Copied: %s\n", destination);

    return 0;
}
