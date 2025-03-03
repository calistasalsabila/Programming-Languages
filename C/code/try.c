#include <stdio.h>
#include <ctype.h>

int main() {
    char buf[100];

    printf("Masukkan teks: ");
    scanf("%s", buf);

    for (int i = 0; buf[i] != '\0'; i++) {
        buf[i] = toupper(buf[i]);
    }

    printf("Teks kapital: %s\n", buf);
    return 0;
}
