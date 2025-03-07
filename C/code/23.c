#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct pnames {
    char *first;
    char *last;
};

int main() {
    struct pnames *person; // Pointer ke struct
    person = (struct pnames *)malloc(sizeof(struct pnames)); // Alokasi struct

    // Alokasi memori untuk string
    person->first = (char *)malloc(20 * sizeof(char));
    person->last = (char *)malloc(20 * sizeof(char));

    strcpy(person->first, "Kim");
    strcpy(person->last, "Dokja");

    printf("First Name: %s\n", person->first);
    printf("Last Name: %s\n", person->last);

    // Bebaskan memori
    free(person->first);
    free(person->last);
    free(person);

    return 0;
}
