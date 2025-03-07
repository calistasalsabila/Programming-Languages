#include <stdio.h>
#include <string.h> // Untuk strcpy()

// Definisi struct day
struct day {
    int totalofDay;
    char name[7][10]; // Array 2D untuk menyimpan string hari
};

int main() {
    struct day aDay; // Deklarasi variabel aDay
    
    aDay.totalofDay = 7; // Mengisi jumlah hari
    
    // Mengisi nama hari menggunakan strcpy()
    strcpy(aDay.name[0], "Mon");
    strcpy(aDay.name[1], "Sun");
    strcpy(aDay.name[2], "Tue");

    // Menampilkan hasil
    printf("Total days: %d\n", aDay.totalofDay);
    printf("Day 1: %s\n", aDay.name[0]);
    printf("Day 2: %s\n", aDay.name[1]);
    printf("Day 3: %s\n", aDay.name[2]);

    return 0;
}
