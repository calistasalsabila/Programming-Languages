#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct pnames {
    char *first;
    char *last;
};

int main() {
    struct pnames person;

    // Alokasi memori
    person.first = (char*)malloc(20 * sizeof(char));
    person.last = (char*)malloc(20 * sizeof(char));

    // Mengisi nilai
    strcpy(person.first, "who");
    strcpy(person.last, "iscal");

    printf("Nama: %s %s\n", person.first, person.last);

    // Jangan lupa free setelah selesai
    free(person.first);
    free(person.last);

    return 0;
}
