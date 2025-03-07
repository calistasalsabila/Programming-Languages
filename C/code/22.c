struct names {
    char first[20];
    char last[20];
};

int main() {
    struct names person; // BUKAN pointer (bentuk variabel biasa)
    
    strcpy(person.first, "Calista"); // Pakai titik `.`
    printf("First Name: %s\n", person.first);

    return 0;
}
